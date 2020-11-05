package nyelviElemek.investment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Investment inv1=new Investment(0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give amount of fund and interest rate, please.");
        inv1.setFund(scanner.nextInt());
        inv1.setInterestRate(scanner.nextInt());
        System.out.println(inv1.getFund());
        System.out.println(inv1.getInterestRate());

        System.out.println(inv1.getYield(80));
        System.out.println(inv1.close(80));

    }



}
