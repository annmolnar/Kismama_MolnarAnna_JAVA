package osztalyokEsObjektumok.attributes.bill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bill {
    List<Item> items = new ArrayList<>();

    public void addItem(Item items1){
        items.add(items1);
    }

    public List<String> getItems() {
        List<String> itemList = new ArrayList<>();
        for(Item i:items){
            itemList.add(i.product);
        }
        return itemList;
    }


    public double calculateTotalPrice(){
        double total = 0;
        for( Item i:items){
            double quantityTimesPrice = i.getPrice()*i.getQuantity();
            total+=quantityTimesPrice;
            //return quantityTimesPrice;
        }
        return total;
    }}
