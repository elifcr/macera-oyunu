package com.company;

import java.util.Locale;

public abstract class BettleLoc extends Location{
    protected Obstacle obstacle;
    BettleLoc(Player player, String name, Obstacle obstacle){
        super(player);
        this.obstacle = obstacle;
        this.name = name;
    }
    public boolean getLocation(){
        int obsCaunt = obstacle.count();
        System.out.println("Şuan buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burda " + obsCaunt + " tane " + obstacle.getName() + "yaşıyor.");
        System.out.print("<S>avaş veya <K>aç: ");
        String selCase = scan.nextLine();
        selCase = selCase.toUpperCase();
        if(selCase.equals("S")){
            if(combat(obsCaunt)){
                System.out.println(this.getName() + " bölgesindeki tüm düşmanları temizlediniz!");
                return true;
            }else{
                System.out.println("Öldünüz !");
                return false;
            }
        }
        return true;
    }

    private boolean combat(int obsCaunt) {
        for(int i = 0; i < obsCaunt; i++){
            playerStats();
            enemyStats();
            while (player.getHealty() > 0 && obstacle.getHealty() > 0){
                System.out.print("<V>ur veya <K>aç: ");
                String selCase = scan.nextLine();
                selCase = selCase.toUpperCase();
                if(selCase.equals("V")){
                    System.out.println("Siz vurdunuz!");
                    obstacle.setHealty(obstacle.getHealty() - player.getTotalDamage());
                    afterHit();
                    System.out.println();
                    System.out.println("Canavar vurdu !");
                    player.setrHealty(player.getHealty() - (obstacle.getDamage() - player.getİnv().getArmor()));
                    afterHit();
                }else{
                    break;
                }
            }
        }
        return true;
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri \n------------------");
        System.out.println("Can: " + player.getHealty());
        System.out.println("Hasar: " + player.getTotalDamage());
        System.out.println("Para: " + player.getMoney());
        if(player.getİnv().getDamage() > 0){
            System.out.println("Silah: " + player.getİnv().getwName());
        }
        if(player.getİnv().getArmor() > 0){
            System.out.println("Zırh: " + player.getİnv().getaName());
        }
    }
    public void enemyStats(){
        System.out.println("\n" + obstacle.getName() + "Değerleri \n-----------------");
        System.out.println("Can: " + obstacle.getHealty());
        System.out.println("Hasar: " + obstacle.getDamage());
        System.out.println("Ödül: " + obstacle.getAward());
    }
    public void afterHit(){
        System.out.println("Oyuncu canı: " + player.getHealty());
        System.out.println(obstacle.getName() + " Canı: " + obstacle.getHealty());
    }
}
