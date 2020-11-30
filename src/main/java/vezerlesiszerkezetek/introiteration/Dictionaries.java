package vezerlesiszerkezetek.introiteration;

import java.util.ArrayList;
import java.util.List;

public class Dictionaries {
    private List<DictionaryItems> dictionaryItems;
    public void addItem(String word, List<String> translations){
        if(!containsWord(word)){
            dictionaryItems.add(new DictionaryItems(word, translations));
        } else {
            for(DictionaryItems d: dictionaryItems){
                if(d.getWord().equals(word)){
                    d.addTranslations(translations);
                }
            }
        }
    }

    private boolean containsWord(String word){
        for(DictionaryItems d: dictionaryItems){
            if(d.getWord().equals(word)){
                return true;
            }
        }
        return false;
    }

    public List<String> findTranslations(String word){
        for(DictionaryItems d: dictionaryItems){
            if(d.getWord().equals(word)){
                return d.getTranslations();
            }
        }return new ArrayList<>();

    }
}
