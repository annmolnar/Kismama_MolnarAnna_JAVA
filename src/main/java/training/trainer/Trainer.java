package training.trainer;

public class Trainer {
    private String name;
    private int yearOfBirth;

    public Trainer(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth=yearOfBirth;
    }

    public String getName(){
        return name;
    }

    public String getNameAndYOB(){
        return name+" "+yearOfBirth;
    }

    public void setName(String newName){
        name = newName;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
