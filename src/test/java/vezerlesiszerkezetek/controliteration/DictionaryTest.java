package vezerlesiszerkezetek.controliteration;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {
    @Test
    public void addItemTest(){
        //Given
        Dictionary dictionary = new Dictionary();

        //When

        //Then
        //assertEquals(dictionary.findTranslations("macska"), Arrays.asList("cat"));
        dictionary.addItem("macska", Arrays.asList("cat", "kitten"));


    }

    @Test
    public void findTranslationTest(){
        //Given
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("macska", Arrays.asList("cat", "kitten"));


        dictionary.findTranslations("malac");

        assertEquals(Arrays.asList("cat", "kitten"), Arrays.asList("cat", "kitten"));


        //When

        //Then

    }
}
