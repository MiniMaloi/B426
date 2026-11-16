package com.joysistvi.day23.polymorphism.Activity16_SIson;

public class MainPen {
    public static void main(String[] args) {
        Pen pen = new Pen("Generic","Black",2.3);
        Pen pen2 = new Ballpen("Panda","Black",3.14,2);
        Pen pen3 = new Marker("FibreCastle", "Red", 10.4, true);
        Pen pen4 = new Pencil("Mongol", "Black", 7, "2B");
        Pen pen5 = new Highlighter("FibreCastle","Yellow",9,"Pastel");
        Ballpen pen6 = new GelPen("FibreCastle", "Pink", 4, 1, true);

        System.out.println("\n=== Calling methods on Pen references ===");
        System.out.println("======== Pen ==============");
        pen.write();
        pen.refill();

        System.out.println("\n======== Ballpen ==========");
        pen2.write();
        pen2.refill();

        System.out.println("\n======== Marker ==========");
        pen3.write();
        pen3.refill();

        System.out.println("\n======== Pencil ==========");
        pen4.write();
        pen4.refill();

        System.out.println("\n======== Highlighter ==========");
        pen5.write();
        pen5.refill();

        System.out.println("\n======== GelPen ==========");
        pen6.write();
        pen6.refill();

        System.out.println("\n-----------TEST PEN--------------\n");
        testPen(pen);
        testPen(pen2);
        testPen(pen3);
        testPen(pen4);
        testPen(pen5);
        testPen(pen6);

        System.out.println("Inherited Brand from Pen: " + pen6.GetBrand());
        System.out.println("Inherited Point Size from BallPen: " + pen6.GetPointSize());

        System.out.println("\n======== Method Overloading ==========");
        pen2.write("Hello");
        pen2.write("Hello", 3);
    }

    public static void testPen(Pen pen){
        System.out.println(pen + "\n");
        pen.write();
        pen.refill();
    }


}

/*
 * Method overloading uses the same method name but with different parameters.
 * It is compile-time polymorphism because Java determines which method to call based on the arguments.
 * Method overriding happens when a child class provides its own implementation of a parent method.
 * It is runtime polymorphism because Java executes the overridden method based on the actual object's type.
 * In my program, write(String) and write(String, int) demonstrate overloading, while write() and refill() demonstrate overriding.
 */
