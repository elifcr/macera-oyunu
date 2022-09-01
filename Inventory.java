package com.company;

public class Inventory {
    private boolean water, food, firewood;
    private String wName, aName;
    private int damage, armor;

    Inventory(){
        this.water = false;
        this.food = false;
        this.firewood = false;
        this.wName = null;
        this.aName = null;
        this.damage = 0;
        this.armor = 0;
    }
    public boolean getWater(){
        return water;
    }
    public void setWater(boolean water){
        this.water = water;
    }
    public boolean getFood(){
        return food;
    }
    public void setFood(boolean food){
        this.food = food;
    }
    public boolean getFirewood(){
        return firewood;
    }
    public void setFirewood(boolean firewood){
        this.firewood = firewood;
    }
    public String getwName(){
        return wName;
    }
    public void setwName(String wName){
        this.wName = wName;
    }
    public String getaName(){
        return aName;
    }
    public void setaName(String aName){
        this.aName = this.aName;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getArmor(){
        return armor;
    }
    public void setArmor(int armor){
        this.armor = armor;
    }
}
