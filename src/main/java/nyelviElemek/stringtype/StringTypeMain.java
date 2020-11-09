package nyelviElemek.stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name="John Doe";
        String message = prefix + name;
        message+=444;
        boolean b=message.equals("Hello John Doe");
        boolean c=message.equals("Hello John Doe444");

        System.out.println(b);
        System.out.println(c);
    }

}
