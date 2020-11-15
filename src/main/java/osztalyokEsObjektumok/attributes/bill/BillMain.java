package osztalyokEsObjektumok.attributes.bill;

import java.util.Arrays;
import java.util.List;

public class BillMain {
    public static void main(String[] args) {
        Item item1 = new Item("bread", 20, 400);
        Item item2 = new Item("milk", 20, 200);
        Item item3 = new Item("sugar", 20, 300);
        Bill bill = new Bill();

        bill.addItem(item1);
        bill.addItem(item2);
        bill.addItem(item3);
        System.out.println(bill.getItems());
        System.out.println(bill.calculateTotalPrice());
    }
}
