package tipusokEsOperatorok.operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operator = new Operators();
        System.out.println(operator.isEven(5));
        System.out.println(operator.isEven(2225588));
        System.out.println(16>>2);
        System.out.println(16<<4);
        System.out.println(13>>1);
        System.out.println(13<<1);
        Multiply multi1 = new Multiply();
        System.out.println(multi1.multiplyByPowerOfTwo(16,4));
    }
}
