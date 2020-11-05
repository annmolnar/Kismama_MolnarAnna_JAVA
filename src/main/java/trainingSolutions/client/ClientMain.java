package trainingSolutions.client;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        /*Client client = new Client();
        System.out.println("Client name, please.");
        Scanner scanner = new Scanner(System.in);
        client.name = scanner.nextLine();
        System.out.println("YOB, please.");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Addess, please.");
        client.address=scanner.nextLine();
        System.out.println(("Given data: name: "+ client.name+" YOB: "+client.yearOfBirth+" address: "+client.address));*/

        Client client = new Client();
        client.setName("Anna");
        client.setYearOfBirth(1991);
        client.setAddress("Győr");
        System.out.println(client.getName()+" "+client.getYearOfBirth()+" "+client.getAddress());
        client.migrate("Gödöllő");
        System.out.println("Address changed successfully: "+client.getAddress());
    }



}
