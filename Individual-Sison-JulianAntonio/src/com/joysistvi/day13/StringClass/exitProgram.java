package com.joysistvi.day13.StringClass;
import java.util.*;
public class exitProgram {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        exitMethod();
        input.close();
    }
    public static void exitMethod() {
        System.out.println("Are you sure that you want to exit the program?" +
                "\n[Y] Yes - Exit the program" +
                "\n[N] No - Return to Main Menu");
        System.out.print("Enter your choice: ");
        String choice = String.valueOf(input.nextLine().trim().charAt(0));

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting the program...");
        } else if (choice.equalsIgnoreCase("N")){
            System.out.println("Returning to Main Menu..");
        } else {
            System.out.println("Invalid code, try again");
        }
    }
}