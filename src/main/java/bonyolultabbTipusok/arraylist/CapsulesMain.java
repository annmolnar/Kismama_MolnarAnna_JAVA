package bonyolultabbTipusok.arraylist;



public class CapsulesMain {
    public static void main(String[] args) {
        Capsules c = new Capsules();
        c.addFirst("pink");
        c.addFirst("brown");
        c.addLast("black");
        System.out.println(c.getColors());
        c.removeFirst();
        c.removeLast();


        System.out.println(c.getColors());
        System.out.println(c.getClass());

    }
}
