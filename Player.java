package com.company;
import java.util.Scanner;
public class Player {
    Scanner scan = new Scanner(System.in);
    private int damage, healty, money, rHealty;
    private String name, cName;
    Inventory i̇nv;

    public Player (String name){
        this.name = name;
        this.i̇nv = new Inventory();

    }
    public void selectCha(){
        switch (chaMenu()){
            case 1:
                initPlayer("Samuray", 5, 21, 15);
                break;
            case 2:
                initPlayer("Okçu", 7, 18, 20);
                break;
            case 3:
                initPlayer("Şovalye", 8, 24, 5);
                break;
            default:
                initPlayer("Samuray", 5, 21, 15);
                break;
        }
        System.out.println("Karakter: " + getcName() + "\t Hasar: " + getDamage() + "\t Sağlık: " + getHealty() + "\t Para: " + getMoney());
    }
    public int chaMenu() {
        System.out.println("Lütfen bir karakter seçiniz: ");
        System.out.println("1- Samuray \t Hasar: 5\t Sağlık: 21,\t Para: 15");
        System.out.println("2- Okçu \t Hasar: 7, \t Sağlık: 18,\t Para: 20");
        System.out.println("3- Şovalye \t Hasar: 8, \t Sağlık: 24, \t Para: 5");
        System.out.print("Karakter Seçiminiz: ");
        int chaID = scan.nextInt();
        while(chaID < 1 || chaID > 3){
            System.out.print("Lütfen geçerli bir karakter seçiniz: ");
            chaID = scan.nextInt();
        }
        return chaID;
    }
    public int getTotalDamage(){
        return this.getDamage() + this.getİnv().getDamage();
    }
    public void initPlayer (String cName, int damage, int healty, int money){
        setcName(cName);
        setDamage(damage);
        setHealty(healty);
        setMoney(money);
        setrHealty(healty);
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getHealty(){
        return healty;
    }
    public void setHealty(int healty){
        this.healty = healty;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getcName(){
        return cName;
    }
    public void setcName(String cName){
        this.cName = cName;
    }
    public Inventory getİnv(){
        return i̇nv;
    }
    public void setİnv( Inventory i̇nv){
        this.i̇nv = i̇nv;
    }
    public int getrHealty(){
        return rHealty;
    }
    public void setrHealty(int rHealty){
        this.rHealty = rHealty;
    }
}
