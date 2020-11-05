package training;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        System.out.println("Hellooo");
        String message = "Hi";
        System.out.println(message);
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();
        //System.out.println("Year of birth " + yearOfBirth);
        int age = 2020-yearOfBirth;
        System.out.println("You are " + age + " years old.");


    }
}
