package com.joysistvi.day9.looping;
public class Activity6_Part2_Sison {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            System.out.print("\nMultiplication Table of " + i + "\n");

            for (int j = 1; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + (i * j) + "\n");
            }
        }
    }

}
