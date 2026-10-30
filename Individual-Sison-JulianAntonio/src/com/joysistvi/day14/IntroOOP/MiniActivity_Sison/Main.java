package com.joysistvi.day14.IntroOOP.MiniActivity_Sison;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendoOffice = new VendingMachine();
        vendoOffice.isRestocked = false;
        vendoOffice.outOfItems = true;
        vendoOffice.inventoryCount = 0;
        vendoOffice.item = "Candy Bar";
        vendoOffice.money = 7874;

        vendoOffice.dispenseItem();
        vendoOffice.insertMoney();
        vendoOffice.refundMoney();
        vendoOffice.dispenseItem();

        VendingMachine vendoBar = new VendingMachine();
        vendoBar.isRestocked = true;
        vendoBar.outOfItems = false;
        vendoBar.inventoryCount = 99;
        vendoBar.item = "Coke in Can";
        vendoBar.money = 3244;

        vendoBar.dispenseItem();
        vendoBar.insertMoney();
        vendoBar.dispenseItem();
        vendoBar.selectItems();

        VendingMachine vendoSchool = new VendingMachine();
        vendoSchool.isRestocked = false;
        vendoSchool.outOfItems = false;
        vendoSchool.inventoryCount = 67;
        vendoSchool.item = "Ballpen";
        vendoSchool.money = 1224;

        vendoSchool.dispenseItem();
        vendoSchool.insertMoney();
        vendoSchool.dispenseItem();

    }
}
