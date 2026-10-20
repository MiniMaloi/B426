package com.joysistvi.day6.conditions;
import java.util.Scanner;
public class Activity4_sison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Age Categorizer---");
        System.out.println("Whats your age?: ");
        int age =scanner.nextInt();
        String category;

        if (age >= 0 && age <= 2 ){
            category = "Baby";
        } else if (age >= 3 && age <= 12 ){
            category = "Child";
        } else if (age >= 13 && age <= 19 ){
            category = "Teenager";
        } else if (age >= 20 && age <= 29 ){
            category = "Young Adult";
        } else if (age >= 30 && age <= 59 ){
            category = "Adult";
        } else if (age >= 60 && age <= 100 ){
            category = "Senior";
        }
        else {
            category = "I have never met someone like you";
        }


        System.out.printf("Your age is: %d %nand it falls under: %s category", age, category);
    }
}
