package com.joysistvi.day9.looping;
import java.util.Scanner;
public class Activity6_Part1_Sison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Simpol Multiplication \n" +
                         "Enter the multiplication table you want to display: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication of Paybb (5)");
        for (int num2 = 1; num2 <= 10; num2++ ){
            int out = num * num2;
            System.out.print(num + " x " + num2 + " = " + out + "\n");
            scanner.close();
        }
    }
}
