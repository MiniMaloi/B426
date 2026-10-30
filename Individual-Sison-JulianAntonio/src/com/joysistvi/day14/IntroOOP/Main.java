package com.joysistvi.day14.IntroOOP;

public class Main {
    public static void main(String[] args) {
        //class instance / create an object of a class

        laptop lappy = new laptop();
        lappy.brand = "HP";
        lappy.color = "Grey";
        lappy.weightInKG = 1.24;
        lappy.cpu = "Celeron";
        lappy.ramInGB = 16;

        lappy.browseInternet();
        lappy.createDocuments();
        lappy.sendMessages();
        lappy.transferDocuments();

        laptop lappy2 = new laptop();
        lappy2.brand = "Lenovo";
        lappy2.color = "White";
        lappy2.weightInKG = 0.02;
        lappy2.cpu = "i7";
        lappy2.ramInGB = 8;

        lappy2.createDocuments();
        lappy2.sendMessages();
        lappy2.transferDocuments();

        laptop lappy3 = new laptop();
        lappy3.brand = "Acer";
        lappy3.color = "Black";
        lappy3.weightInKG = 3.34;
        lappy3.cpu = "Ryzen i5";
        lappy3.ramInGB = 24;

        lappy3.browseInternet();
        lappy3.createDocuments();

    }
}
