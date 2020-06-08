package auto;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner;
public class Vendingmachine {
	
	static String drink[][]={{"礦泉水","10"},{"红茶","15"},{"綠茶","15"},{"可樂","20"},{"沙士","20"},{"咖啡","30"}};

	Drink bottleWater = new Drink("礦泉水",10,3);
	Drink redTea = new Drink("紅茶",15,3);
	Drink greanTea = new Drink("綠茶",15,3);
	Drink Cola = new Drink("可樂",20,3);
	Drink sarSi = new Drink("沙士",20,3);
	Drink coffee = new Drink("咖啡",30,3);
	
	
	public int pay(int totalmoney ,String name){
	  	
	  	if(name == "礦泉水"){
			if(totalmoney >= bottleWater.getPrice() && bottleWater.getQuantity() > 0){
				totalmoney -= bottleWater.getPrice();
				bottleWater.setQuantity(bottleWater.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		return -1;
	  
	  	
		}
	public boolean enoughMoney(int totalmoney,int num){
		if(num == 0){
			if(totalmoney >= bottleWater.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 1){
			if(totalmoney >= redTea.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 2){
			if(totalmoney >= greanTea.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 3){
			if(totalmoney >= Cola.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 4){
			if(totalmoney >= sarSi.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 5){
			if(totalmoney >= coffee.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	public boolean enoughQuantity(int num){
		if(num == 0){
			if(bottleWater.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 1){
			if(redTea.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 2){
			if(greanTea.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 3){
			if(Cola.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 4){
			if(sarSi.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 5){
			if(coffee.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else return false;
	}
	public int charge (int price , int money){
		return money-price;
	}
	  	


	
	

	
	
	
}