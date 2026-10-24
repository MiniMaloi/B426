package com.joysistvi.day9.looping;
public class Activity6_Part2_Sison {
    public static void main(String[] args) {
        for (int num = 1; num <=10; num++){
            System.out.print("\nMultiplication Table of " + num + "\n");

            for (int num2 = 1; num2 <= 10; num2++){
                System.out.print(num + " x " + num2 + " = " + (num * num2) + "\n");
            }
        }
    }

}
