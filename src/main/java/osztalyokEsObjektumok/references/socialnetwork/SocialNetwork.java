package osztalyokEsObjektumok.references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Member> allMembers = new ArrayList<>();

    public void addMember(String name){
         allMembers.add(new Member(name));
    }

    public void connect(String name, String othername){
        Member first = findByName(name);
        Member second = findByName(othername);
        first.connectMember(second);
        //second.connectMember(first);

        //findByName(name).connectMember(findByName(othername)); így is lehetne
    }

    private Member findByName(String name){
        for(Member a:allMembers){
            if(a.getName().equals(name)){
                return a;
            }
        }
        return null;
    }

     public List<String> bidirectionalConnections(){
        List<String> bcList = new ArrayList<>();
        for(Member bc: allMembers){
            for(Member bc2: bc.getConnections()){
                if(bc2.getConnections().contains(bc)){
                    String s = bc.getName()+ " - " + bc2.getName();
                    bcList.add(s);
                }

            }
        }
        return bcList;
     }


}

