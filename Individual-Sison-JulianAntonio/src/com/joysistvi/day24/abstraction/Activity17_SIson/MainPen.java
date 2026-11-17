package com.joysistvi.day24.abstraction.Activity17_SIson;

public class MainPen {
    public static void main(String[] args) {
        /* Pen pen = new Pen("Generic","Black",2.3);
        Compilation error: Pen is abstract and cannot be instantiated directly.
        Only concrete subclasses such as Ballpen and Marker can be instantiated.
         */
        Ballpen ballpen = new Ballpen("Panda", "Black", 3.14, 2);
        Marker marker = new Marker("FibreCastle", "Red", 10.4, true);
        Pencil pencil = new Pencil("Mongol", "Black", 7, "2B");
        Highlighter highlighter = new Highlighter("FibreCastle","Yellow",9,"Pastel");
        GelPen gelPen = new GelPen("FibreCastle", "Pink", 4, 1, true);

        System.out.println("\n=== Calling methods on Pen references ===");
//        System.out.println("======== Pen ==============");
//        pen.write();
//        pen.store();

//        System.out.println("\n======== Ballpen ==========");
//        ballpen.write();
//        ballpen.store();
//
//        System.out.println("\n======== Marker ==========");
//        marker.write();
//        marker.store();
//
//        System.out.println("\n======== Pencil ==========");
//        pencil.write();
//        pencil.store();
//
//        System.out.println("\n======== Highlighter ==========");
//        highlighter.write();
//        highlighter.store();
//
//        System.out.println("\n======== GelPen ==========");
//        gelPen.write();
//        gelPen.store();

        System.out.println("\n-----------TEST PEN--------------\n");
        testPen(ballpen);
        System.out.println();
        testPen(marker);
        System.out.println();
        testPen(pencil);
        System.out.println();
        testPen(highlighter);
        System.out.println();
        testPen(gelPen);

        System.out.println("Inherited Brand from Pen: " + gelPen.GetBrand());
        System.out.println("Inherited Point Size from BallPen: " + gelPen.GetPointSize());

        System.out.println("\n=== testRefillable() ===");

        ballpen.refill();
        testRefillable(ballpen);
        marker.refill();
        testRefillable(marker);
        gelPen.refill();
        testRefillable(gelPen);

        System.out.println("\n=== testClickable() ===");

        testClickable(ballpen);
        //testClickable(marker); - not valid since no click implementation on marker
        testClickable(gelPen);

        System.out.println("\n======== Method Overloading ==========");
        ballpen.write("Hello", 3);


    }

    public static void testPen(Pen pen){
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    public static void testRefillable(Refillable refillable) {
        System.out.println("Maximum refills: " + refillable.MAX_REFILLS + "\n");
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }


}
