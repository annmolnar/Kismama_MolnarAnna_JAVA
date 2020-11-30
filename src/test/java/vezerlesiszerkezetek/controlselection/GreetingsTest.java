package vezerlesiszerkezetek.controlselection;

import org.junit.jupiter.api.Test;
import vezerlesiszerkezetek.controlselection.greetings.Greetings;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test
    public void sayGreetingsTest(){
        Greetings greetings = new Greetings();
        assertEquals("Jó éjt!", greetings.Greetings(20,01));
    }

}
