package com.joysistvi.day9.looping;
import java.util.Scanner;
public class Activity6_Part1_Sison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Simpol Multiplication \n" +
                         "Enter the multiplication table you want to display: ");
        int num = scanner.nextInt();
        System.out.print("Multiplication of " + num);
            for (int num2 = 1; num2 <= 10; num2++ ) {
                while (num >= 10 || num <= 1){
                System.out.print(num + " x " + num2 + " = " + (num * num2) + "\n");
                scanner.close();
            }
                System.out.println("Invalid, input must be between 1 - 10");
            }
        }
    }
