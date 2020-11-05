package trainingSolutions.uml;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("Product name, please.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Product price, please.");
        int price=scanner.nextInt();
        Product product1 = new Product(name,price);
        System.out.println(product1.getName()+" "+product1.getPrice());
        product1.increasePrice(200);
        System.out.println(product1.getPrice());
        product1.decreasePrice(400);
        System.out.println(product1.getPrice());
    }

}
