package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    void testCreate() {
        //Given
        Trainer trainer = new Trainer("Anna M");

        //When
        String name = trainer.getName();

        //Then
        assertEquals("Anna M", name);

    }
}
