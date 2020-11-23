package osztalyokEsObjektumok.references.socialnetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member {
    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections(){
        return connections;
    }

    public void connectMember(Member member){
        connections.add(member);
        List<String> names = new ArrayList<>();
        for (Member c:connections){
            names.add(c.getName());
            System.out.println(names);
        }

    }
}
