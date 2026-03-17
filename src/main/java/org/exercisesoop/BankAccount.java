package org.exercisesoop;

public class BankAccount {

    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }

        this.accountHolder = accountHolder;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter (only for name!)
    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }
        this.accountHolder = accountHolder;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit must be positive");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw must be positive");
        } else if (amount > balance) {
            System.out.println(accountHolder + " has insufficient funds. Withdrawal of "
                    + amount + " failed.");
        } else {
            balance -= amount;
        }
    }
}