package com.joysistvi.day11.arrays;
import java.util.Scanner;
public class Activity8_Sison {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String again;

            System.out.println("-----Total and Average Calculator-----");


                do {
                    int[] numbers = new int[5];
                    System.out.println("Please enter your five numbers:");

                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Number " + (i + 1) + ": ");
                        numbers[i] = input.nextInt();
                    }

                    System.out.println("\nYou entered:");

                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println("Index " + i + ": " + numbers[i]);
                    }
                    int sum = 0;
                    int highest = numbers[0];
                    int lowest = numbers[0];

                    for (int i = 0; i < numbers.length; i++) {
                        sum += numbers[i];

                        if (numbers[i] > highest) {
                            highest = numbers[i];
                        }

                        if (numbers[i] < lowest) {
                            lowest = numbers[i];
                        }
                    }

            double average = (double) sum / numbers.length;

            System.out.println("\nSum = " + sum);
            System.out.println("Average = " + average);
            System.out.println("Highest = " + highest);
            System.out.println("Lowest = " + lowest);
            System.out.println("Do you want to try it again? (Y/N)");
            again = input.next(); }

                while (again.equals("Y") || again.equals("y"));
            System.out.println("Thank you for using the calculator!");

            input.close();
        }

}
