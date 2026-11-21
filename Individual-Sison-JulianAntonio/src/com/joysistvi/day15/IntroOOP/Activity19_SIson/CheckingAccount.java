package com.joysistvi.day15.IntroOOP.Activity19_SIson;

public class CheckingAccount extends Account
        implements Transaction, Transferable, Overdraftable {

    private final double overdraftLimit;

    public CheckingAccount(String accountNumber,
                           String accountHolder,
                           double balance) {
        this(accountNumber, accountHolder, balance, OVERDRAFT_LIMIT);
    }

    public CheckingAccount(String accountNumber,
                           String accountHolder,
                           double balance,
                           double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {

        System.out.println(toString());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    public boolean isWithinOverdraft(double amount) {
        return getBalance() - amount >= -overdraftLimit;
    }

    @Override
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        setBalance(getBalance() + amount);

        System.out.println("Deposited " + amount +
                ". New balance: " + getBalance());
    }

    public void deposit(double amount, String remarks) {
        deposit(amount);
        System.out.println("Remarks: " + remarks);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (!isWithinOverdraft(amount)) {
            System.out.println("Withdrawal failed: exceeds the overdraft limit of "
                    + overdraftLimit);
            return false;
        }

        setBalance(getBalance() - amount);
        System.out.println("Withdrew " + amount +
                ". New balance: " + getBalance());
        return true;
    }

    public boolean withdraw(double amount, String remarks) {
        boolean result = withdraw(amount);
        System.out.println("Remarks: " + remarks);
        return result;
    }

    @Override
    public boolean transfer(Transaction target, double amount) {

        System.out.println("Transferring " + amount + "...");

        if (withdraw(amount)) {

            target.deposit(amount);

            System.out.println("Transfer success. Your new balance is " + getBalance());

            return true;
        }

        System.out.println("Transfer failed.");
        return false;
    }

    public boolean transfer(Transaction target,
                            double amount,
                            String remarks) {

        boolean result = transfer(target, amount);
        System.out.println("Remarks: " + remarks);
        return result;
    }
}
