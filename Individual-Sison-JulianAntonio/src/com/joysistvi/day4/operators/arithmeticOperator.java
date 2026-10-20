package com.joysistvi.day4.operators;
public class arithmeticOperator {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 7;
        int sum = num1 + num2; //add
        int dif = num1 - num2; //sub
        int pro = num1 * num2; //times
        //casting po ito V --- kailangan mas malaki yung data type sa icacast na data type
        double qou = (double) num1 / num2; // divide na may decimal
        //or int qou = num1 / num 2 --- divide na walang decimal
        double remain = num1 % num2; //pagstore ng remainder

        //concat
        String name = "WORLD";
        System.out.println(name + 10);

        //simple addition
        System.out.println(10 + 1 + " is the sum of two numbrsz");
        System.out.println("Sum: " + sum);

        //simple substraction
        System.out.println(10 - 1 + " is the difference of two numbrsz");

        System.out.println("Difference: " + dif);

        //simple multiplication
        System.out.println(10 * 5 + " is the product of two numbrsz");
        System.out.println("Product: " + pro);

        //simple division with modulo and casting
        System.out.println(10 / 5 + " is the qoutient of two numbrsz");
        System.out.println("Quotient: " + qou);
        System.out.println("Remainder: " + remain);




    }
}
