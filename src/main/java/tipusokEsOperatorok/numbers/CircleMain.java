package tipusokEsOperatorok.numbers;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a kör átmérőjét.");
        double diameter1= scanner.nextDouble();
        Circle circle1= new Circle(diameter1);
        System.out.println("A kör kerülete:");
        System.out.println(circle1.circlePerimeter(diameter1));
        System.out.println("A kör területe:");
        System.out.println(circle1.circleArea(diameter1));

        double a = 10;
        double b = (15 - a) / 2 * (double) 3;
        System.out.println(b);




    }
}

