package com.joysistvi.day22.inheritance.Activity15_SIson;

public class MainPen {
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("Panda","Black",3.14,2);
        Marker marker = new Marker("FibreCastle", "Red", 10.4, true);
        Pencil pencil = new Pencil("Mongol", "Black", 7, "2B");
        Highlighter highlighter = new Highlighter("FibreCastle","Yellow",9,"Pastel");
        GelPen gelPen = new GelPen("FibreCastle", "Pink", 4, 1, true);

        System.out.println("======== Ballpen ==========");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n======== Marker ==========");
        System.out.println(marker);
        marker.write();

        System.out.println("\n======== Pencil ==========");
        System.out.println(pencil);
        pencil.write();

        System.out.println("\n======== Highlighter ==========");
        System.out.println(highlighter);
        highlighter.write();

        System.out.println("\n======== GelPen ==========");
        System.out.println(gelPen);
        gelPen.write();

        System.out.println("Inherited Brand: " + gelPen.GetBrand());
        System.out.println("Inherited Point Size: " + gelPen.GetPointSize());
    }
}
