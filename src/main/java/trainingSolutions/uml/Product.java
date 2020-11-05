package trainingSolutions.uml;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void increasePrice(int addedPrice){
        price+=addedPrice;
    }

    public void decreasePrice(int decreasedPrice){
        price-=decreasedPrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
