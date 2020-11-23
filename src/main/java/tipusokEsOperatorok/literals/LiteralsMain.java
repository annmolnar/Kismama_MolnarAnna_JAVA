package tipusokEsOperatorok.literals;

import static java.lang.Integer.bitCount;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("1 "+"2");
        System.out.println("1 ".concat("2"));

        double doubleQuotient = 3/4D;
        System.out.println(doubleQuotient);
        long num = 3_244_444_444L;
        long big = num;
        String s = "árvíztükörfűrógép";
        System.out.println(s);

        String word = "title".toUpperCase();
        System.out.println(word);

        int i = bitCount( 110);
        System.out.println(i);
        int j = bitCount( -2);
        System.out.println(j);
    }
}
