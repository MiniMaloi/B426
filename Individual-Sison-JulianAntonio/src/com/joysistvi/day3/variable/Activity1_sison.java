package com.joysistvi.day3.variable;

public class Activity1_sison {
    public static void main(String[] args) {
        //Full Name
        String firstName = "Julian Antonio";
        String lastName = "Sison";

        char firstNameInitial = 'J';
        char secondNameInitial = 'A';
        char middleInitial = 'T';
        char lastInitial = 'S';
        System.out.println("My name is " + lastName + ", " + firstName + ' ' + middleInitial + '.');

        //Initials
        System.out.print("My initials are ");
        System.out.println(" " + firstNameInitial + secondNameInitial + middleInitial + lastInitial);

        //age
        int age = 24;
        System.out.println("And my age is " + age);

        //YearBirth

        short birthYear = 2002;
        System.out.println("I wa born on " + birthYear);

        //byte
        byte siblingPos = 1;
        byte siblingNum = 3;
        System.out.println("In siblings, I am the " + siblingPos + " of " + siblingNum);

        //BMI
        float height = 170.18f;
        double weight = 67.56232d;
        System.out.println("I am " + height + "cm tall");
        System.out.println("and I weigh " + weight + "kg");

        //employment
        boolean isWorking = true;
        System.out.println("Am I currently working? " + isWorking);

        //salary
        long salaryYear = 1_000_000_000;
        System.out.println("And getting paid " + salaryYear + " pesos yearly, in my dreams");

        System.out.println("Delete System32");
        //end
    }
}
