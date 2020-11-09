package nyelviElemek.introcontrol;

import javax.naming.InsufficientResourcesException;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl intro1 = new IntroControl();

        System.out.println(intro1.substractTenIfGreaterThanTen(8));

        IntroControl intro2 = new IntroControl();
        System.out.println(intro2.describeNumber(0));
        System.out.println(intro2.describeNumber(3));

        IntroControl intro3 = new IntroControl();
        System.out.println(intro3.greetingToJoe("Joe"));
        System.out.println(intro3.greetingToJoe("Joey"));

        IntroControl intro4=new IntroControl();
        System.out.println(intro4.calculateBonus(1000010));
        System.out.println(intro4.calculateBonus(800000));

        BoatRental introBoat = new BoatRental();
        System.out.println(introBoat.rentedBoats(1));
        System.out.println(introBoat.rentedBoats(3));
        System.out.println(introBoat.rentedBoats(5));
        System.out.println(introBoat.rentedBoats(7));
        System.out.println(introBoat.rentedBoats(8));
        System.out.println(introBoat.rentedBoats(12));

        IntroControl intro5= new IntroControl();
        System.out.println(intro5.calculateConsumption(9998, 4));
        System.out.println(intro5.calculateConsumption(6667, 6669));

        IntroControl intro6 = new IntroControl();
        intro6.printNumbersBetween(15);

        IntroControl intro7= new IntroControl();
        intro7.printNumbersInBetween(2,6);
        intro7.printNumbersInBetween(6,2);

        IntroControl intro8= new IntroControl();
        intro8.printOddNumbers(21);
        intro8.printOddNumbers(16);
    }

}
