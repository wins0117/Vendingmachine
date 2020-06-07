package auto;

public class Drink {
    private String name;
    private int price;
    private int quantity;
    

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public Drink(String name,int price, int quantity){
        this.name = name;
        this.price = price ;
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
}