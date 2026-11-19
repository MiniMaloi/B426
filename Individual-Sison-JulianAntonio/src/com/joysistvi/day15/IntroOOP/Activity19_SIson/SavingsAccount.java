package com.joysistvi.day15.IntroOOP.Activity19_SIson;

public abstract class SavingsAccount extends Account
        implements Transaction, Transferable, InterestBearing {

    public static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        setBalance(getBalance() + amount);

        System.out.println("Deposited " + amount
                + ". New balance: " + getBalance());
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
            return;
        }

        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println( "Your amount is insufficient to proceed the withdraw." +
                                "\nWould you like to have another transaction?" +
                                "\n1. Yes" + "\n2. No");
        }
    }
}
