package vezerlesiszerkezetek.controliteration;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {
    private String word;
    private List<String> translations = new ArrayList<>();


    public DictionaryItem(String word, List<String> translations){
        this.word = word;
        addTranslations(translations);
    }

    public void addTranslations(List<String> list){
        for (String s : list) {
            if (translations.contains(s)) {
                System.out.println("This has already been added: "+s);
            }
            else {
                //System.out.println(s);
                translations.add(s);
            }
        }

    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }
}
