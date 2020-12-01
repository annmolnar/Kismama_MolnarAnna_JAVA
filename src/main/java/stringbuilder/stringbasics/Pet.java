package stringbuilder.stringbasics;

import java.util.Arrays;
import java.util.List;

public class Pet {
    String name;
    String gender;
    String regNumber;

    public Pet(String name, String gender, String regNumber) {
        this.name = name;
        List<String> genderList = Arrays.asList("male", "female", "unknown");
            if(genderList.contains(gender)){
                this.gender = gender;
            }else throw new IllegalArgumentException("Please give valid gender.");
        this.regNumber = regNumber;
        if(regNumber.length()!=6){
            throw new IllegalArgumentException("Please give valid registration number.");
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
