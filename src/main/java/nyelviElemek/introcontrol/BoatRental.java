package nyelviElemek.introcontrol;

public class BoatRental {
    public String rentedBoats(int numberOfPersons){
        int boat5 = 5;
        int boat3 = 3;
        int boat2 = 2;
        int placesLeft = 10-numberOfPersons;
        int onShore = numberOfPersons-10;
        if (numberOfPersons<=boat2){
            return "Number of persons: " + numberOfPersons+ ", taken: boat2(for max 2ppl) "+placesLeft+" places left";
        }
        if (numberOfPersons==boat3){
            return "Number of persons: " + numberOfPersons+ ", taken: boat3(for max 3ppl)"+placesLeft+" places left";
        }
        if(numberOfPersons<=boat5){
            return "Number of persons: " + numberOfPersons+ ", taken: boat5(for max 5ppl)"+placesLeft+" places left";
        }
        if (numberOfPersons<=boat5+boat2){
            return "Number of persons: " + numberOfPersons+ ", taken: boat5+2(for max 7ppl)"+placesLeft+" places left";
        }
        if (numberOfPersons<=boat3+boat5){
            return "Number of persons: " + numberOfPersons+ ",taken: boat5+3(for max 8ppl)"+placesLeft+" places left";
        }
        if (numberOfPersons<=boat3+boat5+boat2){
            return "Number of persons: " + numberOfPersons+ ", taken: boat5+3+2(for max 10ppl)"+placesLeft+" places left";
        }
        return "Number of persons: " + numberOfPersons+ ", taken: boat5+3+2(for max 10ppl), "+onShore +" ppl on shore";
    }
}
