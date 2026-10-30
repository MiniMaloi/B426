package com.joysistvi.day15.mathMethods;
import java.util.*;
public class activity11_Sison {
        public static void main(String[] args) {

            System.out.println("----------------------------------------");
            System.out.println(" Student Grade and Mathematics Analyzer ");
            System.out.println("----------------------------------------");

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the student name: ");
            String name = input.nextLine();

            String subjects[] = new String[3];
            int grades [] = new int[3];

            for (int count = 0; count < 3; count++) {
                System.out.print("Enter subject " + (count + 1) + " :");
                String subject = input.nextLine();

                System.out.print("Whats your grade? ");
                int grade = input.nextInt();
                input.nextLine();

                subjects[count] = subject;
                grades[count] = grade;

            }

            System.out.println("\nSUBJECT AND GRADES");

            for(int count = 0; count < 3; count++){
                System.out.println(subjects[count] + " - " + grades[count]);
            }

            int highest = Math.max(grades[0], Math.max(grades[1], grades[2]));
            int lowest = Math.min(grades[0], Math.min(grades[1], grades[2]));
            System.out.println( "\nYour highest grade is " + highest +
                    " and your lowest grade is " + lowest);

            float total = 0;

            for (int count = 0; count < grades.length; count++) {
                total += grades[count];
            }

            double average = (double) total / grades.length;

            System.out.println("Your Exact Average is: " + average);
            System.out.println("Your Rounded Average is: " + Math.round(average));
            System.out.println("Your UP Rounded Average is: " + Math.ceil(average));
            System.out.println("Your DOWN Rounded Average is: " + Math.floor(average));

            System.out.println("----------------Math Analyzer----------------");

            System.out.print("\nEnter any number please: ");
            float num = input.nextInt();

            System.out.print("\nHow about the power? ");
            int pow = input.nextInt();

            double power = Math.pow(num,pow);
            double squareR = Math.sqrt(num);
            double log = Math.log(num);

            double log10 = Math.log10(num);
            double expo = Math.exp(num);
            double absol = Math.abs(num);

            System.out.println("\n------------Mathematical Results------------");
            System.out.println("Squared Value: " + power);
            System.out.println("Square Root: " + squareR);
            System.out.println("Natural Logarithm: " + log);
            System.out.println("Base-10 Logarithm: " + log10);
            System.out.println("Exponential Value: " + expo);
            System.out.println("Absolute Value: " + absol);

            System.out.println("\n----------Trigonometric Calculator----------");

            System.out.print("\nEnter any angle you want in degrees: ");
            double angle = input.nextDouble();

            double radians = Math.toRadians(angle);
            double sine = Math.sin(radians);
            double cosine = Math.cos(radians);
            double tangent = Math.tan(radians);
            double randomNumber = Math.random();

            System.out.println("\n------------Trigonomic Results------------");
            System.out.println("i2 ang Sine: " + sine);
            System.out.println("i2 ang Cosine: " + cosine);
            System.out.println("i2 ang Tangent: " + tangent);
            System.out.println("And, the Random Number: " + randomNumber);
        }
    }
