package auto;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner;
public class Vendingmachine { 
	
	static String drink[][]={{"礦泉水","10"},{"红茶","15"},{"綠茶","15"},{"可樂","20"},{"沙士","20"},{"咖啡","30"}};
	
	int money= 0;
	
	Vendingmachine(){
		
		money=0;
		
	}
	
	void pay(int m){

	  	money=m;
	  	System.out.println("投入金額為："+money);
		
	  }
	
	void show(){
		
		System.out.println("\n   飲料 \t\t檟格");

		for(int i=0;i<6;i++){
			System.out.print((i+1)+". ");
			
			for(int j=0;j<2;j++){
				System.out.print(drink[i][j]+" \t\t");
			}
			System.out.println();
		}
		System.out.println("目前金額:"+money);
		
	}
	
	void choose(){

		int choice; 
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in)); 
	  	while(true){

		      System.out.print("請輸入要買的飲料：(輸入9結束)");
		      
		      while(true){
		  		try{ 
		  			choice = Integer.valueOf(scanner.readLine());
		  			break;
		  		 }catch(Exception e){System.out.println("輸入錯誤");}
		      }
		      if(choice>0&&choice<=6){ 
		    	  int c=choice-1;
		    	  System.out.println("你選擇的是"+drink[c][0]+"，金額為"+drink[c][1]);
		    	  if(money>=Integer.parseInt(drink[c][1])){

		              money-=Integer.parseInt(drink[c][1]);

		              System.out.println("已買了"+drink[c][0]+"，金額為"+drink[c][1]);
		              
		    	  }
		    	  
		    	  else

		              System.out.println("金額不足!!!");
		    	  
		      }
		      else if(choice==9)
		    	  
		    	  break;
		      
		      else

		          System.out.println("輸入錯誤");

		        show();

		      }
	  	}
	
	void givechange(){

		    System.out.println("找回"+money+"元");

		  	money=0;
		  	
	}
	
	public static void main(String args[]){
		
		Vendingmachine v = new Vendingmachine();
		
		int money; 

		//Scanner scanner = new Scanner(System.in);
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print(""); 
		System.out.print("請輸入投幣金額"); 
		
		while(true){
		try{ 
			money = Integer.valueOf(scanner.readLine());
			if(money>0)
				break;
			else
		          System.out.println("請輸入大於0的數!!");

	     }catch(Exception e){System.out.println("輸入錯誤");}
		
	    }

	    v.pay(money);

	    v.show();

	    v.choose();

	    v.givechange();
		
		      
		
	}
}