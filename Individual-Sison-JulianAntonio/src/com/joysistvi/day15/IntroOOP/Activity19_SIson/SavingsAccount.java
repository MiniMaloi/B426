package com.joysistvi.day15.IntroOOP.Activity19_SIson;

public class SavingsAccount extends Account
        implements Transaction, Transferable, InterestBearing {

    public static final double MIN_BALANCE = 500.0;

    private final double interestRate;

    public SavingsAccount(String accountNumber,
                          String accountHolder,
                          double balance) {

        this(accountNumber, accountHolder, balance, INTEREST_RATE);
    }

    public SavingsAccount(String accountNumber,
                          String accountHolder,
                          double balance,
                          double interestRate) {

        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
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

    @Override
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Withdrawal failed: balance cannot go below "
                    + MIN_BALANCE);
            return false;
        }

        setBalance(getBalance() - amount);

        System.out.println("Withdrew " + amount
                + ". New balance: " + getBalance());

        return true;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println(toString());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance: " + MIN_BALANCE);
    }

    @Override
    public void addInterest() {

        double interest = getBalance() * (interestRate / 100);
        setBalance(interest + getBalance());
        System.out.println( "Interest added: " + interest +
                            ". New balance: " + getBalance());
    }

    @Override
    public boolean transfer(Transaction target, double amount) {

        System.out.println("Transferring " + amount + "...");

        if (withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transfer successfully, your new balance is " + getBalance());
            return true;
        }
        System.out.println("Transfer failed, insufficient balance.");
        return false;
    }

    public boolean transfer(Transaction target, double amount, String remarks) {
        boolean result = transfer(target, amount);
        System.out.println("Remarks: " + remarks);
        return result;
    }

    public void deposit(double amount, String remarks) {
        deposit(amount);
        System.out.println("Remarks: " + remarks);
    }

    public boolean withdraw(double amount, String remarks) {

        boolean result = withdraw(amount);

        System.out.println("Remarks: " + remarks);

        return result;
    }
}
