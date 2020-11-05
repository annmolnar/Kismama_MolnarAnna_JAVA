package trainingSolutions.store;

public class Store {
    private String product;
    private int stock;

    public Store(String product){
        this.product=product;
        this.stock= 0;
    }

    public void store(int num){
        stock += num;
    }

    public void dispatch(int delivered){
        stock-=delivered;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }


}
