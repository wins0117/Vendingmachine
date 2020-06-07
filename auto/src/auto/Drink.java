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

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getBottlewaterQuantity() {
        return quantity;
    }

    public void setBottlewaterQuantity(int quantity,int bought) {
    	quantity=50;
    	this.quantity -= bought;
    }
    
    public int getRedteaQuantity() {
        return quantity;
    }

    public void setRedteaQuantity(int quantity,int bought) {
    	quantity=50;
    	this.quantity -= bought;
    }
    
    public int getGreenteaQuantity() {
        return quantity;
    }

    public void setGreenteaQuantity(int quantity,int bought) {
    	quantity=50;
    	this.quantity -= bought;
    }
    
    public int getColaQuantity() {
        return quantity;
    }

    public void setColaQuantity(int quantity,int bought) {
    	quantity=50;
    	this.quantity -= bought;
    }
    
    public int getSarsiQuantity() {
        return quantity;
    }

    public void setSarsiQuantity(int quantity,int bought) {
    	quantity=50;
    	this.quantity -= bought;
    }

    public int getCoffeeQuantity() {
        return quantity;
    }

    public void setCoffeeQuantity(int quantity,int bought) {
    	quantity=50;
    	this.quantity -= bought;
    }

    
}