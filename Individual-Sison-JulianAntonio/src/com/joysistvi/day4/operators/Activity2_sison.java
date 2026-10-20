package com.joysistvi.day4.operators;

public class Activity2_sison {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        double percentFoodAllowance = (foodAllowance / income) * 100;
        double percentTransportation = (transportation / income) * 100;
        double percentRent = (rent / income) * 100;
        double percentUtility = (utilityBill / income) * 100;
        double totalCost = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalCost;
        double percentRemainingBalance = (remainingBalance / income) * 100;

        System.out.println("-----------------Sison's Budget Tracker------------------");
        System.out.printf("Total Income: $%,.0f%n", income);
        System.out.println("_________________________________________________________");
        System.out.printf("Food Allowance: %.1f%% of the total allowance %n", percentFoodAllowance);
        System.out.printf("Transportation: %.1f%% of the total allowance %n", percentTransportation);
        System.out.printf("Rent: %.1f%% of the total allowance %n", percentRent);
        System.out.printf("Utility: %.1f%% of the total allowance %n", percentUtility);
        System.out.println("_________________________________________________________");
        System.out.printf("Remaining Balance: $%,.0f %n", remainingBalance);
        System.out.printf("Which is %.1f%% of the income%n", percentRemainingBalance);
    }
}