package nyelviElemek.investment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Investment inv1=new Investment(0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a befektetett összeget.");
        inv1.setFund(scanner.nextInt());
        System.out.println("Kérem a kamatlábat.");

        inv1.setInterestRate(scanner.nextInt());
        System.out.println("Befektetett összeg: " + inv1.getFund());
        System.out.println("Kamatláb: " + inv1.getInterestRate());

        System.out.println("Hozam 50 napra: " + inv1.getYield(50));
        System.out.println("Kivett összeg 80 nap után: "+ inv1.close(80));
        System.out.println("Kivett összeg 90 nap után: "+ inv1.close(90));

    }



}
