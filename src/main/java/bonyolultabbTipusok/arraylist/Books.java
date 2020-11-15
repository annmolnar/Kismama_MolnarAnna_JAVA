package bonyolultabbTipusok.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> titles = new ArrayList<>();

    public void add(String newTitle){
        titles.add(newTitle);
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> beginsWith = new ArrayList<>();
        for(String t:titles){
            if (t.startsWith(prefix)){
                System.out.println(t);
                beginsWith.add(t);
            }
        }
       return beginsWith;
    }
}
