package com.joysistvi.day13.StringClass;
import java.util.Scanner;
public class Activity10_Sison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your country: ");
        String country = input.nextLine().trim();
        //String country = "       Philippines         ".trim();
        char[] letters = country.toCharArray();
        char firstLetter = country.charAt(0);
        int size = country.length();
        char lastLetter = country.charAt(country.length() - 1);
        int chosenCount = 0;
        int vowelCount = 0;
        //choosing what to type
        System.out.print("Enter the letter you want to count: ");
        String chosenLetters = input.nextLine();
        //Displaying first and last letters
        System.out.println("\nYour country is: " + country);
        System.out.println("The first letter of " + country + " is " + firstLetter);
        System.out.println("And the last letter of " + country + " is " + lastLetter);
        //displaying 'chosenLetter' and vowels present in
        for (int letterCount = 0; letterCount < size; letterCount++){
            char currentLetter =  letters[letterCount];
            if (chosenLetters.indexOf(currentLetter) != -1){
                chosenCount++;
            }
            if ("aeiou".indexOf(currentLetter) != -1) {
                vowelCount++;
            }
        }
        //System.out.println("And the number of P/p are: " + chosenCount);
        System.out.println("And the number of " + chosenLetters + " are: " + chosenCount);
        System.out.println("And the number of vowels are: " + vowelCount);
        System.out.print("\nEnter the letter you want to be replaced: ");
        String oldLetter = input.nextLine();
        System.out.print("Enter the new letter: ");
        String newLetter = input.nextLine();
        if(country.contains(oldLetter)){
            country = country.replace(oldLetter,newLetter);
            System.out.println("The spelling was changed to: " + country);
        }
    }
}
