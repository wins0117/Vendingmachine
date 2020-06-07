package auto;

public class Drink {
    private String name;
    private int price;
    private int Bottlewaterquantity=50;
    private int Redteaquantity=50;
    private int Greenteaquantity=50;
    private int Colaquantity=50;
    private int Sarsiquantity=50;
    private int Coffeequantity=50;
    

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
        return Bottlewaterquantity;
    }

    public void setBottlewaterQuantity(int Bottlewaterquantity,int bought) {
    	this.Bottlewaterquantity -= 1;
    }
    
    public int getRedteaQuantity() {
        return Redteaquantity;
    }

    public void setRedteaQuantity(int Redteaquantity,int bought) {
    	this.Redteaquantity -= 1;
    }
    
    public int getGreenteaQuantity() {
        return Greenteaquantity;
    }

    public void setGreenteaQuantity(int Greenteaquantity,int bought) {
    	this.Greenteaquantity -= 1;
    }
    
    public int getColaQuantity() {
        return Colaquantity;
    }

    public void setColaQuantity(int Colaquantity,int bought) {
    	this.Colaquantity -= 1;
    }
    
    public int getSarsiQuantity() {
        return Sarsiquantity;
    }

    public void setSarsiQuantity(int Sarsiquantity,int bought) {
    	this.Sarsiquantity -= 1;
    }

    public int getCoffeeQuantity() {
        return Coffeequantity;
    }

    public void setCoffeeQuantity(int Coffeequantity,int bought) {
    	this.Coffeequantity -= 1;
    }

    
}