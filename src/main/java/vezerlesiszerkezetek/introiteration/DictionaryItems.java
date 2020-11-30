package vezerlesiszerkezetek.introiteration;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItems {
    private String word;
    private List<String> translations = new ArrayList<>();


    public DictionaryItems(String word, List<String> translations){
        this.word = word;
        addTranslations(translations);
    }

    public void addTranslations(List<String> translations){
        for (String s : translations) {
            if (!this.translations.contains(s)) {
                this.translations.add(s);
            }
            else {

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

