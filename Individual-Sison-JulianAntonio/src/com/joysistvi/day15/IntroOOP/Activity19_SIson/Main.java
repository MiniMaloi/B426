
package com.joysistvi.day15.IntroOOP.Activity19_SIson;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(
                "1001", "Cyril Anne Domingo", 5000.0);

        CheckingAccount checking = new CheckingAccount(
                "2001", "Maria Santos", 1000.0);

        System.out.println("=== Savings Account ===");
        testAccount(savings);

        System.out.println("\n=== Checking Account ===");
        testAccount(checking);

        //Savings transactions
        savings.deposit(1000);
        savings.withdraw(5800);
        System.out.println("\n=== Savings Transactions ===");
        savings.deposit(500, "Birthday gift");
        savings.withdraw(1500, "Rent");

        //Checking transactions
        System.out.println("\n=== Checking Transactions ===");
        checking.withdraw(2500);
        checking.withdraw(1000);

        //Transfer
        System.out.println("\n=== Transfer (Savings to Checking) ===");
        savings.transfer(checking, 1000);

        //Interest
        System.out.println("\n=== Interest ===");
        savings.addInterest();

        System.out.println("\n=== Checking Stretch Goal ===");

        //Testing stretch goal
        CheckingAccount customChecking = new CheckingAccount(
                "2002", "Ana Cruz", 1000.0, 3000.0);
        testAccount(customChecking);
        customChecking.withdraw(3500);
    }

    public static void testAccount(Account account) {
        account.displayAccountInfo();
    }
}

/*
    Encapsulation: Account - private fields, getters, and protected setBalance().
    Inheritance: SavingsAccount and CheckingAccount extend Account.
    Polymorphism (Overriding): displayAccountInfo() in both child classes.
    Polymorphism (Overloading): deposit() and withdraw() with remarks.
    Abstraction (Abstract Class): Account and displayAccountInfo().
    Abstraction (Interfaces): Transaction, Transferable, InterestBearing, Overdraftable.
    Constants: MIN_BALANCE, INTEREST_RATE, and OVERDRAFT_LIMIT.
 */



