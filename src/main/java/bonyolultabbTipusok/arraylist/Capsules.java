package bonyolultabbTipusok.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    List<String> capsule = new ArrayList<>();

    public void addLast(String i){
        capsule.add(i);
    }

    public void addFirst(String first){
        capsule.add(first);
    }

    public void removeFirst(){
        capsule.remove(0);
    }

    public void removeLast(){
        capsule.remove(capsule.size()-1);
    }

   public List<String> getColors(){
        return capsule;
    }
}
