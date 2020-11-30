package week;

import vezerlesiszerkezetek.controlselection.week.DayOfWeek;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {


    @Test
    void testCreate() {
        //Given
        DayOfWeek dayOfWeek = new DayOfWeek();

        //When
        dayOfWeek.getPartOfWeek("hétfő");

        //Then
        assertEquals("hét eleje", dayOfWeek.getPartOfWeek("hétfő"));
        assertEquals("hét vége", dayOfWeek.getPartOfWeek("szombat"));
    }
}
