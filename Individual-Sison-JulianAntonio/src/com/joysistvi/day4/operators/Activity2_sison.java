package com.joysistvi.day4.operators;

public class Activity2_sison {
    public static void main(String[] args) {
        double  income = 50000,
                foodAllowance = 15000,
                transportation = 2500,
                rent = 4500,
                utilityBill = 3500,
                percentFoodAllowance = (foodAllowance / income) * 100,
                percentTransportation = (transportation / income) * 100,
                percentRent = (rent / income) * 100,
                percentUtility = (utilityBill / income) * 100,
                totalCost = foodAllowance + transportation + rent + utilityBill,
                remainingBalance = income - totalCost,
                percentRemainingBalance = (remainingBalance / income) * 100;

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