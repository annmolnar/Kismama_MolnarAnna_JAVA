package bonyolultabbTipusok.finalmodifier;

public class TaxCalculator {
    static final int VAT = 27;
    public double tax(double price){
        return price*VAT/100;
    }

    public double priceWithTax(double price){
        return tax(price)+price;
    }

    public static void main(String[] args) {
        TaxCalculator showTax = new TaxCalculator();
        System.out.println(showTax.tax(100));
        System.out.println(showTax.priceWithTax(100));
    }
}
