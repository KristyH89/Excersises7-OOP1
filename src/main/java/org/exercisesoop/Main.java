package org.exercisesoop;

public class Main {

    public static void main(String[] args) {


        System.out.println("""
               ==============================
               Exercise 1
               ==============================
                """);
        System.out.println();

        BankAccount account1 = new BankAccount("Leonard", 6000);
        BankAccount account2 = new BankAccount("Penny", 100);

        account1.deposit(600);
        account1.withdraw(100);

        account2.deposit(100);
        account2.withdraw(250);

        System.out.println(account1.getAccountHolder() + " balance: " + account1.getBalance());
        System.out.println(account2.getAccountHolder() + " balance: " + account2.getBalance());

        System.out.println();
        System.out.println("""
               ==============================
               Exercise 2
               ==============================
                """);
        System.out.println();

        Customer customer1 = new Customer(1, "Leonard Hofstadter", "leonard@gmail.com");
        Customer customer2 = new Customer(2, "Penny", "penny@gmail.com");

        // Update data safely
        customer1.setEmail("leonard.hofstadter@gmail.com");
        customer2.setName("Penny Hofstadter");

        // Show that each object has its own data
        System.out.println(customer1);
        System.out.println(customer2);
    }
}