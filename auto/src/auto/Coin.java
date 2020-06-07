package auto;

public class Coin {
    private int totalmoney = 0;

    

    public int getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney,int coin) {
        this.totalmoney += coin;
    }
    
}