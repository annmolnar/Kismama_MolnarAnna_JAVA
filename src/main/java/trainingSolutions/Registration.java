package trainingSolutions;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Name, plase.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Email, plase.");
        String email = scanner.nextLine();
        System.out.println("Data given: name: " + name + " email: "+ email);
    }
}
