package com.company;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);



    public void login (){
        System.out.println("Macera oyununa hoşgeldiniz! ");
        System.out.print("Oyuna başlamadan önce isminizi giriniz: ");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        player.selectCha();
        this.player = player;
        start();
    }
    public void start (){
         while (true) {
             System.out.println();
             System.out.println("================================================================");
             System.out.println();
             System.out.println("Eylem gerçekleştirmek için bir yer seçiniz: ");
             System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düşman yok!");
             System.out.println("2. Mağara --> Karşınza belki zombi çıkabilir!");
             System.out.println("3. Orman --> Karşınıza belki vampir çıkabilir!");
             System.out.println("4. Nehir --> Karşınıza belki ayı çıkabilir!");
             System.out.println("5. Mağaza --> Silah veya Zırh alabilirsiniz.");
             System.out.print("Gitmek istediğiniz yer: ");

             int selLoc = scan.nextInt();

             while (selLoc < 1 || selLoc > 5) {
                 System.out.print("Lütfen geçerli bir yer seçiniz: ");
                 selLoc = scan.nextInt();
             }
             switch (selLoc) {
                 case 1:
                     location = new SafeHause(player);
                     break;
                 case 2:
                     location = new Cave(player);
                     break;
                 case 3:
                     location = new Forest(player);
                     break;
                 case 4:
                     location = new River(player);
                     break;
                 case 5:
                     location = new ToolStore(player);
                     break;
                 default:
                     location = new SafeHause(player);
             }

             if (!location.getLocation()) {
                 System.out.println("Oyun bitti! ");
                 break;
             }
         }
    }

}
