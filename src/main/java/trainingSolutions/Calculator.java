package trainingSolutions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(("Please give a whole number."));
        Scanner scanner = new Scanner(System.in);
        int givenNum = scanner.nextInt();
        System.out.println("Another one, plase.");
        int givenNum2 = scanner.nextInt();
        System.out.println(givenNum +"+"+ givenNum2);
        int result = givenNum + givenNum2;
        System.out.println("That equals "+ result+".");



    }
}
