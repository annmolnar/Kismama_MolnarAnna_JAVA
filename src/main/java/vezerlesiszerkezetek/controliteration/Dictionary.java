package vezerlesiszerkezetek.controliteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {
    List<DictionaryItem> listOfWords = new ArrayList<>();

    public void addItem(String word, List<String> newTranslations) {
        DictionaryItem newItem = new DictionaryItem(word, newTranslations);
        List<String> l = new ArrayList<>();
        List<String> li = new ArrayList<>();
        listOfWords.add(newItem);
        int count = 0;
        for (int i=0;i<listOfWords.size();i++) {
            if (newItem.getWord().equals(listOfWords.get(i).getWord())){
                count++;}
            if(count>1){
                listOfWords.remove(newItem);
                System.out.println("This word is already in the dictionary: " +newItem.getWord());
            }
        }
        System.out.println(listOfWords.size());
    }

    public List<String> findTranslations(String word) {
        List<String> translationsList = new ArrayList<>();
        for (DictionaryItem d : listOfWords) {
            if (d.getWord().equals(word)) {
                translationsList = d.getTranslations();
            }
        }
        return translationsList;
    }
}
