package vezerlesiszerkezetek.exceptionhandling;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = name;
        if(name.length()==0){
            throw new IllegalArgumentException("Please give name.");
        }
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
        if(yearOfBirth<=1900){
            throw new IllegalArgumentException("We dont't treat patients that old!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Anna", "vvvv122", 1900);
    }
}
