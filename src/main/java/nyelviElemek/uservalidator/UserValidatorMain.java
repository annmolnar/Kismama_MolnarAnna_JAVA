package nyelviElemek.uservalidator;

import java.util.Scanner;

public class UserValidatorMain {
    public static void main(String[] args) {
        UserValidator user = new UserValidator();
        System.out.println("Please choose a username.");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        user.isValidUserName(username);
        System.out.println("Please choose a password.");
        String passWord1=scanner.nextLine();
        System.out.println("Please confirm password.");
        String passWord2=scanner.nextLine();
        user.isValidPassword(passWord1, passWord2);
        System.out.println("Please enter email.");
        String email = scanner.nextLine();
        user.isValidEmail(email);
        //System.out.println(user.messageForUser(username, passWord1, email));
    }
}
