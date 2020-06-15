package auto2;

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

  private JButton btnBottlewater = new JButton("礦泉水 X");
  private JButton btnRedtea = new JButton("红茶 X");
  private JButton btnGreentea = new JButton("綠茶 X");
  private JButton btnCola = new JButton("可樂 X");
  private JButton btnSarsi = new JButton("沙士 X");
  private JButton btnCoffee = new JButton("咖啡 X");

  private JButton btnOnedollar = new JButton("1元");
  private JButton btnFivedollar = new JButton("5元");
  private JButton btnTendollar = new JButton("10元");
  Coin coin = new Coin();

  Vendingmachine ven = new Vendingmachine();

  public CGameF() {
    // 副標
    lblPlay.setBounds(10, 10, 150, 60);
    add(lblPlay);
    lblComp.setBounds(140, 10, 150, 60);
    add(lblComp);
    // 販賣機狀態
    lblTotalmoney.setBounds(370, 90, 150, 30);
    add(lblTotalmoney);
    lblChange.setBounds(370, 130, 150, 30);
    add(lblChange);
    lblInputmony.setBounds(370, 170, 150, 30);
    add(lblInputmony);
    // 飲料選項
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
    // 零錢
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
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public ActionListener ListGame = new ActionListener() {
    public void actionPerformed(ActionEvent e) {

      //只完成礦泉水
      if (e.getSource() == btnBottlewater) {
        if(ven.enoughMoney(coin.getTotalmoney(), 0)  && ven.enoughQuantity(0)){
          int charge = ven.charge(ven.bottleWater.getPrice(),coin.getTotalmoney());
          coin.setTotalMoney(charge);
          ven.bottleWater.setQuantity(ven.bottleWater.getQuantity()-1);
          lblComp.setText("礦泉水剩餘數量 : " + ven.bottleWater.getQuantity());
          lblPlay.setText("購買一瓶礦泉水");
          lblInputmony.setText("投入金額 : 0");
          lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
          lblChange.setText("找零 : " + charge);
          checkLight(coin.getTotalmoney());
        }
        else{
          lblComp.setText("金額或庫存數量不足");
          lblPlay.setText("");
          checkLight(coin.getTotalmoney());
        }
      }
      if (e.getSource() == btnRedtea) {
        if(ven.enoughMoney(coin.getTotalmoney(), 1)  && ven.enoughQuantity(1)){
          int charge = ven.charge(ven.redTea.getPrice(),coin.getTotalmoney());
          coin.setTotalMoney(charge);
          ven.redTea.setQuantity(ven.redTea.getQuantity()-1);
          lblComp.setText("紅茶剩餘數量 : " + ven.redTea.getQuantity());
          lblPlay.setText("購買一瓶紅茶");
          lblInputmony.setText("投入金額 : 0");
          lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
          lblChange.setText("找零 : " + charge);
          checkLight(coin.getTotalmoney());
        }
        else{
          lblComp.setText("金額或庫存數量不足");
          lblPlay.setText("");
          checkLight(coin.getTotalmoney());
        }
      }
      if (e.getSource() == btnGreentea) {
        if(ven.enoughMoney(coin.getTotalmoney(), 2)  && ven.enoughQuantity(2)){
          int charge = ven.charge(ven.greanTea.getPrice(),coin.getTotalmoney());
          coin.setTotalMoney(charge);
          ven.greanTea.setQuantity(ven.greanTea.getQuantity()-1);
          lblComp.setText("綠茶剩餘數量 : " + ven.greanTea.getQuantity());
          lblPlay.setText("購買一瓶綠茶");
          lblInputmony.setText("投入金額 : 0");
          lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
          lblChange.setText("找零 : " + charge);
          checkLight(coin.getTotalmoney());
        }
        else{
          lblComp.setText("金額或庫存數量不足");
          lblPlay.setText("");
          checkLight(coin.getTotalmoney());
        }
      }
      if (e.getSource() == btnCola) {
        if(ven.enoughMoney(coin.getTotalmoney(), 3)  && ven.enoughQuantity(3)){
          int charge = ven.charge(ven.Cola.getPrice(),coin.getTotalmoney());
          coin.setTotalMoney(charge);
          ven.Cola.setQuantity(ven.Cola.getQuantity()-1);
          lblComp.setText("可樂剩餘數量 : " + ven.Cola.getQuantity());
          lblPlay.setText("購買一瓶可樂");
          lblInputmony.setText("投入金額 : 0");
          lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
          lblChange.setText("找零 : " + charge);
          checkLight(coin.getTotalmoney());
        }
        else{
          lblComp.setText("金額或庫存數量不足");
          lblPlay.setText("");
          checkLight(coin.getTotalmoney());
        }
      }
      if (e.getSource() == btnSarsi) {
        if(ven.enoughMoney(coin.getTotalmoney(), 4)  && ven.enoughQuantity(4)){
          int charge = ven.charge(ven.sarSi.getPrice(),coin.getTotalmoney());
          coin.setTotalMoney(charge);
          ven.sarSi.setQuantity(ven.sarSi.getQuantity()-1);
          lblComp.setText("沙士剩餘數量 : " + ven.sarSi.getQuantity());
          lblPlay.setText("購買一瓶沙士");
          lblInputmony.setText("投入金額 : 0");
          lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
          lblChange.setText("找零 : " + charge);
          checkLight(coin.getTotalmoney());
        }
        else{
          lblComp.setText("金額或庫存數量不足");
          lblPlay.setText("");
          checkLight(coin.getTotalmoney());
        }
      }
      if (e.getSource() == btnCoffee) {
        if(ven.enoughMoney(coin.getTotalmoney(), 5)  && ven.enoughQuantity(5)){
          int charge = ven.charge(ven.coffee.getPrice(),coin.getTotalmoney());
          coin.setTotalMoney(charge);
          ven.coffee.setQuantity(ven.coffee.getQuantity()-1);
          lblComp.setText("咖啡剩餘數量 : " + ven.coffee.getQuantity());
          lblPlay.setText("購買一瓶咖啡");
          lblInputmony.setText("投入金額 : 0");
          lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
          lblChange.setText("找零 : " + charge);
          checkLight(coin.getTotalmoney());
        }
        else{
          lblComp.setText("金額或庫存數量不足");
          lblPlay.setText("");
          checkLight(coin.getTotalmoney());
        }
      }

      

      if (e.getSource() == btnOnedollar) {
        coin.insertCoin(coin.getTotalmoney(), 1);
        lblInputmony.setText("投入金額 : 1");
        lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
        checkLight(coin.getTotalmoney());
      }
      if (e.getSource() == btnFivedollar) {
        coin.insertCoin(coin.getTotalmoney(), 5);
        lblInputmony.setText("投入金額 : 5");
        lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
        checkLight(coin.getTotalmoney());
      }
      if (e.getSource() == btnTendollar) {
        coin.insertCoin(coin.getTotalmoney(), 10);
        lblInputmony.setText("投入金額 : 10");
        lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
        checkLight(coin.getTotalmoney());
      }
    }
  };



  public void checkLight(int totalmoney) {
    boolean enoughtMoney[] = new boolean[6];
    boolean enoughtQuantity[] = new boolean[6];
    for(int i = 0 ; i <= 5 ; i++){
      enoughtMoney[i]= ven.enoughMoney(totalmoney, i);
      enoughtQuantity[i] = ven.enoughQuantity(i);
    }
    if(enoughtMoney[0] == true && enoughtQuantity[0] == true){
      btnBottlewater.setText("礦泉水 O");
    }
    else{
      btnBottlewater.setText("礦泉水 X");
    }
    if(enoughtMoney[1] == true && enoughtQuantity[1] == true){
      btnRedtea.setText("紅茶 O");
    }
    else{
      btnRedtea.setText("紅茶 X");
    }
    if(enoughtMoney[2] == true && enoughtQuantity[2] == true){
      btnGreentea.setText("綠茶 O");
    }
    else{
      btnGreentea.setText("綠茶 X");
    }
    if(enoughtMoney[3] == true && enoughtQuantity[3] == true){
      btnCola.setText("可樂 O");
    }
    else{
      btnCola.setText("可樂 X");
    }
    if(enoughtMoney[4] == true && enoughtQuantity[4] == true){
      btnSarsi.setText("沙士 O");
    }
    else{
      btnSarsi.setText("沙士 X");
    }
    if(enoughtMoney[5] == true && enoughtQuantity[5] == true){
      btnCoffee.setText("咖啡 O");
    }
    else{
      btnCoffee.setText("咖啡 X");
    }

  }
  

  public static void main(String args[]) {
    CGameF gameF = new CGameF();
  }
}