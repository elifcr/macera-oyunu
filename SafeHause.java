package com.company;

public class SafeHause extends NormalLoc{
    SafeHause(Player player){
        super(player, "Güvenli Ev");
    }
    public boolean getLocation(){
        player.setrHealty(player.getrHealty());
        System.out.println("İyileştiniz...");
        System.out.println("Şuan Güvenli Ev adlı yerdesiniz.");
        return true;
    }
}
