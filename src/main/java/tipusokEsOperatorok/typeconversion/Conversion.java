package tipusokEsOperatorok.typeconversion;

public class Conversion {
    public static void main(String[] args) {
        int i = 5;
        long l = 500_000_000;
        float f = 1;
        double d = 10.2;

        //l=i;
        //i=l;
        f = l;
        d = l;
        System.out.println(f);
        System.out.println(d);

        //byte b = 10000;
        i = (int) l;
        System.out.println(i);
        i = (int) d;

    }
}
