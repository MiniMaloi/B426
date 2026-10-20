package com.joysistvi.day4.operators;

public class unaryOperators {

    public static void main(String[] args) {

        int num = 10;
        boolean isActive = false;
        int num2 = 69;
        //int num3 = 70;

        //negating an expression
        System.out.println(-num);

        //inverting the value of a boolean
        System.out.println(!isActive);

        //increment and decrement a value by one
        //pre

        System.out.println(--num2);
        System.out.println(++num2);

        //post
        num2--;
        System.out.println(num2);

        //System.out.println(num3--);
    }

}
