package auto;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner;
public class Vendingmachine { 
	
	static String drink[][]={{"礦泉水","10"},{"红茶","15"},{"綠茶","15"},{"可樂","20"},{"沙士","20"},{"咖啡","30"}};

	Drink bottleWater = new Drink("礦泉水",10,20);
	Drink redTea = new Drink("紅茶",15,20);
	Drink greanTea = new Drink("綠茶",15,20);
	Drink Cola = new Drink("可樂",20,20);
	Drink sarSi = new Drink("沙是",20,20);
	Drink coffee = new Drink("咖啡",30,20);
	
	
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