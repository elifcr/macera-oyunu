package com.company;

public class ToolStore extends NormalLoc {
    ToolStore(Player player) {
        super(player, "Mağaza");

    }

    public boolean getLocation() {
        System.out.println("Para: " + player.getMoney());
        System.out.println("1.Silahlar");
        System.out.println("2.Zırhlar");
        System.out.println("3.Çıkış");
        System.out.print("Seçiminiz: ");
        int selTool = scan.nextInt();
        int selItemID;

        switch (selTool) {
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }
        return true;
    }

    public int armorMenu() {
        System.out.println("1. Hafif \t <Para : 15 - Engelleme : 1>");
        System.out.println("2. Orta \t <Para : 25 - Engelleme : 3>");
        System.out.println("3. Ağır \t <Para : 40 - Engelleme : 5>");
        System.out.println("4. Çıkış");
        System.out.println("Silah seçiniz: ");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }

    public int buyArmor(int itemID) {
        int avoid = 0, price = 0;
        String aName = null;
        switch (itemID) {
            case 1:
                aName = "Hafif Zırh";
                avoid = 1;
                price = 15;
                break;
            case 2:
                aName = "Orta Zırh";
                avoid = 3;
                price = 25;
                break;
            case 3:
                aName = "Ağır Zırh";
                avoid = 5;
                price = 40;
                break;
            case 4:
                System.out.println("Çıkış Yapılıyor.");
                break;
            default:
                System.out.println("Geçersiz İşlem ! ");
                break;

        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getİnv().setArmor(avoid);
                player.getİnv().setaName(aName);
                player.setMoney(player.getMoney() - price);
                System.out.println(aName + " satın aldınız, Engellenen Hasar: " + player.getİnv().getArmor()
                        + ", Yeni Hasar: " + player.getTotalDamage());
                System.out.println("Kalan Para: " + player.getMoney());

            } else {
                System.out.println("Para yetersiz.");
            }
        }
        return avoid;
    }


    public int weaponMenu() {
        System.out.println("1. Tabanca\t <Para : 25 - Hasar : 2>");
        System.out.println("2. Kılıç\t <Para : 35 - Hasar : 3>");
        System.out.println("3. Tüfek\t <Para : 45 - Hasar : 7>");
        System.out.println("4. Çıkış");
        System.out.println("Silah seçiniz: ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;

    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        switch (itemID) {
            case 1:
                wName = "Tabanca";
                damage = 2;
                price = 25;
                break;
            case 2:
                wName = "Kılıç";
                damage = 3;
                price = 35;
                break;
            case 3:
                wName = "Tüfek";
                damage = 7;
                price = 45;
                break;
            case 4:
                System.out.println("Çıkış Yapılıyor.");
                break;
            default:
                System.out.println("Geçersiz İşlem ! ");
                break;

        }
        if(price > 0){
            if(player.getMoney() > price){
                player.getİnv().setDamage(damage);
                player.getİnv().setwName(wName);
                player.setMoney(player.getMoney() - price);
                System.out.println(wName + " satın aldınız. Önceki Hasar: " + player.getDamage()
                        + ", Yeni Hasar: " + player.getTotalDamage());
                System.out.println("Kalan Para: " + player.getMoney());

            }else{
                System.out.println("Para yetersiz.");
            }
        }
    }
}
