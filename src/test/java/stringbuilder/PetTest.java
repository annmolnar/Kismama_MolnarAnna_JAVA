package stringbuilder;

import org.junit.jupiter.api.Test;
import stringbuilder.stringbasics.Pet;
import stringbuilder.stringbasics.Vet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    @Test
    public void createTest(){
        Pet pet = new Pet("Molli", "male", "012345");

        assertEquals("Molli", pet.getName());
    }

    @Test
    public void addTest(){
        Vet vet = new Vet();
        Pet pet = new Pet("Molli", "male", "012345");
        Pet pet2 = new Pet("Moli", "female", "016345");
        vet.add(pet);
        vet.add(pet);
        assertEquals(1,vet.getPetList().size());
    }
}
