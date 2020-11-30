package vezerlesiszerkezetek.controliteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryMain {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        //DictionaryItem dictionaryItem = new DictionaryItem("ball", Arrays.asList("labda", "bál"));
        //DictionaryItem dictionaryItem2 = new DictionaryItem("kutya", Arrays.asList("dog", "doggie"));
        //System.out.println(dictionaryItem.getTranslations());
        //dictionaryItem2.addTranslations(Arrays.asList("pup", "puppy"));
        //System.out.println(dictionaryItem.getTranslations());
        dictionary.addItem("malac", Arrays.asList("pig", "piglet"));
        dictionary.addItem("kutya", Arrays.asList("dog", "doggie"));
        dictionary.addItem("kutya", Arrays.asList("dog", "doggie"));
        dictionary.addItem("kutya", Arrays.asList("pup", "puppy"));
        //dictionaryItem.addTranslations(Arrays.asList("beast", "animal"));
        //System.out.println(dictionaryItem.getTranslations());
        //System.out.println(dictionaryItem.getWord());
        System.out.println(dictionary.findTranslations("malac"));


    }
}
