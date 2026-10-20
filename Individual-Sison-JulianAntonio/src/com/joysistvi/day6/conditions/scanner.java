package com.joysistvi.day6.conditions;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        // 1. Create a Scanner object attached to the standard input stream
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // 2. Read a line of text
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        // 3. Read an integer
        int age = scanner.nextInt();

        // Display the input back to the user
        System.out.println("Hello " + name + "! Next year you will be " + (age + 1) + ".");

        // 4. Close the scanner when done
        scanner.close();
    }
}
