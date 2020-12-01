package stringbuilder.stringbasics;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    List<Pet> petList = new ArrayList<>();

    public List<Pet> getPetList() {
        return petList;
    }

    public void add(Pet pet){
        if(!areEquals(pet)){
            petList.add(pet);
        }

    }

    private boolean areEquals(Pet animal){
        for(Pet p: petList){
            if(p.getRegNumber().equals(animal.getRegNumber())){
            return true;
            }
        }
        return false;
    }
}
