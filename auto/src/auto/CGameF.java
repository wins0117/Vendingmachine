package auto;
import javax.swing.*;
import java.awt.event.*;

class CGameF extends JFrame {
  private int play_win = 0, comp_win = 0, same_win = 0;
  private JLabel lblPlay = new JLabel("1");
  private JLabel lblComp = new JLabel("2");
  private JLabel lblTotalmoney = new JLabel("使用者金額 : 0");
  private JLabel lblChange = new JLabel("找零 : 0");
  private JLabel lblInputmony = new JLabel("投入金額 : 0");
  private JLabel lblResult = new JLabel("購買狀態");

  private JButton btnBottlewater = new JButton("礦泉水");
  private JButton btnRedtea = new JButton("红茶");
  private JButton btnGreentea = new JButton("綠茶");
  private JButton btnCola = new JButton("可樂");
  private JButton btnSarsi = new JButton("沙士");
  private JButton btnCoffee = new JButton("咖啡");
  
  private JButton btnOnedollar = new JButton("1元");
  private JButton btnFivedollar = new JButton("5元");
  private JButton btnTendollar = new JButton("10元");
Coin coin = new Coin();
Vendingmachine ven = new Vendingmachine();
  public CGameF()  {
    //副標
	lblPlay.setBounds(10, 10, 150, 60);		    
	add(lblPlay);
	lblComp.setBounds(140, 10, 150, 60);	    
    add(lblComp);
    //販賣機狀態
    lblTotalmoney.setBounds(370, 90, 150, 30);	  
    add(lblTotalmoney);
    lblChange.setBounds(370, 130, 150, 30);	
    add(lblChange);
    lblInputmony.setBounds(370, 170, 150, 30);	    
    add(lblInputmony);
    //飲料選項
    lblResult.setBounds(130, 210, 150, 40);	  
    add(lblResult);
    btnBottlewater.setBounds(10, 90, 90, 30);     
    add(btnBottlewater);
    btnRedtea.setBounds(130, 90, 90, 30);      
    add(btnRedtea);
    btnGreentea.setBounds(250, 90, 90, 30);      
    add(btnGreentea);
    btnCola.setBounds(10, 180, 90, 30);      
    add(btnCola);

    btnSarsi.setBounds(130, 180, 90, 30);
    add(btnSarsi);
    btnCoffee.setBounds(250, 180, 90, 30);
    add(btnCoffee);
    //零錢
    btnOnedollar.setBounds(370, 210, 90, 30);
    add(btnOnedollar);
    btnFivedollar.setBounds(370, 250, 90, 30);
    add(btnFivedollar);
    btnTendollar.setBounds(370, 290, 90, 30);
    add(btnTendollar);

	btnBottlewater.addActionListener(ListGame);
	btnRedtea.addActionListener(ListGame);
	btnGreentea.addActionListener(ListGame);
    btnCola.addActionListener(ListGame);
    btnSarsi.addActionListener(ListGame);
    btnCoffee.addActionListener(ListGame);

    btnOnedollar.addActionListener(ListGame);
    btnFivedollar.addActionListener(ListGame);
    btnTendollar.addActionListener(ListGame);


    setTitle("自動販賣機");                   
    setLayout(null);
    setSize(500,500);                       
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

	public ActionListener ListGame = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    	// 按重來鈕
    	if(e.getSource() == btnCola){
          ven.pay(coin.getTotalmoney());
          lblPlay.setText("請出拳...");
          lblPlay.setIcon(new ImageIcon(""));
          lblComp.setText("看誰先贏五次！！");
          lblComp.setIcon(new ImageIcon(""));
          lblTotalmoney.setText("玩家贏次數 : 0");
          lblChange.setText("電腦次數 : 0");
          lblInputmony.setText("平手次數 : 0");
          lblResult.setText("輸贏狀態");
          same_win = 0;  comp_win = 0;  play_win = 0;
	      btnBottlewater.addActionListener(ListGame);
	      btnRedtea.addActionListener(ListGame);
	      btnGreentea.addActionListener(ListGame);
       }
        // 按剪刀鈕
       if(e.getSource() == btnBottlewater){
      	  lblPlay.setText("玩家出剪刀");
    	  lblPlay.setIcon(new ImageIcon("images/scissor.jpg"));
          int comp = RandomComputer();
          Check(1,comp);  // play = 1
       }
       // 按石頭鈕
       if(e.getSource() == btnRedtea){
		  lblPlay.setText("玩家出石頭");
		  lblPlay.setIcon(new ImageIcon("images/stone.jpg"));
          int comp = RandomComputer();
          Check(2,comp);  // play = 2
       }
       // 按布鈕
       if(e.getSource() == btnGreentea){
		  lblPlay.setText("玩家出布");
		  lblPlay.setIcon(new ImageIcon("images/paper.jpg"));
          int comp = RandomComputer();
          Check(3,comp);  // play = 3
       }
       if(e.getSource() == btnOnedollar){
         coin.setTotalmoney(coin.getTotalmoney(), 1);
        lblInputmony.setText("投入金額 : 1");
        lblTotalmoney.setText("使用者金額 : "+coin.getTotalmoney());
       }
       if(e.getSource() == btnFivedollar){
        coin.setTotalmoney(coin.getTotalmoney(), 5);
       lblInputmony.setText("投入金額 : 5");
       lblTotalmoney.setText("使用者金額 : "+coin.getTotalmoney());
      }
      if(e.getSource() == btnTendollar){
        coin.setTotalmoney(coin.getTotalmoney(), 10);
       lblInputmony.setText("投入金額 : 10");
       lblTotalmoney.setText("使用者金額 : "+coin.getTotalmoney());
      }
    }
  };

	// 電腦出拳
  public int RandomComputer(){
  	int num = (int)(Math.random() * 3 + 1);
    switch(num){
      case 1:
        lblComp.setText("電腦出剪刀");
        lblComp.setIcon(new ImageIcon("images/scissor.jpg"));
   		  break;
      case 2:
        lblComp.setText("電腦出石頭");
        lblComp.setIcon(new ImageIcon("images/stone.jpg"));
        break;
      case 3:
        lblComp.setText("電腦出布");
        lblComp.setIcon(new ImageIcon("images/paper.jpg"));
        break;
    }
    return num;
  }

  public void Check(int play,int comp){
    if(play == comp ){
		  same_win++;
		  lblInputmony.setText("平手次數 : " + same_win);
      lblResult.setText("雙方平手，再試一次！！");
    }
    if((play - comp) == 2 || (play - comp) == -1 ){
    	comp_win++;
    	lblChange.setText("電腦贏次數 : " + comp_win);
    	lblResult.setText("你猜輸了，再加油！");
	  }
    if((play - comp) == 1 || (play - comp) == -2 ){
    	play_win++;
    	lblTotalmoney.setText("玩家贏次數 : " + play_win);
    	lblResult.setText("你猜贏了，太棒了！");
    }
    if(play_win >= 5 ){
    	lblResult.setText("遊戲結束！ 你贏了！");
  	  btnBottlewater.removeActionListener(ListGame);
  	  btnRedtea.removeActionListener(ListGame);
  	  btnGreentea.removeActionListener(ListGame);
    }
	  if(comp_win >= 5){
      lblResult.setText("遊戲結束！你輸了！");
	    btnBottlewater.removeActionListener(ListGame);
	    btnRedtea.removeActionListener(ListGame);
	    btnGreentea.removeActionListener(ListGame);
    }

    
  }
  public static void main (String args[]) {
    CGameF gameF = new CGameF();
  }
}


