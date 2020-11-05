package trainingSolutions.store;

import org.w3c.dom.ls.LSOutput;

public class MainStore {
    public static void main(String[] args) {
        Store storeHouse = new Store("bread");
        //System.out.println(store.setStock(5));
        System.out.println(storeHouse.getStock());
        System.out.println(storeHouse.getStock());
        storeHouse.store(5);
        System.out.println(storeHouse.getStock());
        storeHouse.store(8);
        storeHouse.dispatch(4);
        storeHouse.dispatch(5);

        System.out.println(storeHouse.getProduct()+" "+storeHouse.getStock());

        Store storeHouse2 = new Store("sugar");
        storeHouse2.store(25);
        storeHouse2.dispatch(10);
        storeHouse2.dispatch(5);
        storeHouse2.store(2);
        System.out.println(storeHouse2.getProduct()+" "+storeHouse2.getStock());


    }


}
