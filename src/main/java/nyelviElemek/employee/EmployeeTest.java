package nyelviElemek.employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give birth year.");
        int y = scanner.nextInt();
        System.out.println("Please give birth month.");
        int m = scanner.nextInt();
        System.out.println("Please give birth day.");
        int d = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please give name.");
        String n = scanner.nextLine();
        Employee employee1=new Employee(y,m,d, n);
        System.out.println(employee1.getName());
        System.out.println(employee1.getDateOfBirth());
        System.out.println(employee1.getBeginEmployment());


    }
}
