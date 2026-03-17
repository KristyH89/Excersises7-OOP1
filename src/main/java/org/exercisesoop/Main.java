package org.exercisesoop;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Leonard", 6000);
        BankAccount account2 = new BankAccount("Penny", 100);

        account1.deposit(600);
        account1.withdraw(100);

        account2.deposit(100);
        account2.withdraw(250);

        System.out.println(account1.getAccountHolder() + " balance: " + account1.getBalance());
        System.out.println(account2.getAccountHolder() + " balance: " + account2.getBalance());
    }
}