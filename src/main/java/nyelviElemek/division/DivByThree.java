package nyelviElemek.division;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        System.out.println("Please give me a whole number.");
        int a;
        Scanner scanner = new Scanner(System.in);
        a= scanner.nextInt();
        scanner.nextLine();


        if (a % 3 == 0) {
            System.out.println("Osztható hárommal.");
        }
        else System.out.println("Nem osztható hárommal.");




    }

}
