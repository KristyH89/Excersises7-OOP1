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


        System.out.println();
        System.out.println("""
               ==============================
               Exercise 3
               ==============================
                """);


                Student student1 = new Student(1, "Harry Potter", 17, "Defense Against the Dark Arts");
                Student student2 = new Student(2, "Hermione Granger", 17, "Potions");
                Student student3 = new Student(3, "Ron Weasley", 17, "Care of Magical Creatures");
                Student student4 = new Student(4, "Luna Lovegood", 16, "Divination");

                // Optional: Update data safely
                student4.setMajor("Magical Creatures & Divination");

                // Show that each object represents a unique student
                System.out.println(student1);
                System.out.println(student2);
                System.out.println(student3);
                System.out.println(student4);



        System.out.println();
        System.out.println("""
               ==============================
               Exercise 4
               ==============================
                """);

        Product product1 = new Product(1, "Foodprocessor", 149.99);
        Product product2 = new Product(2,"Slowcooker", 99);
        Product product3 = new Product(3, "Rice cooker", 99);

        // Optional: Sale price
        product3.setPrice(74.99);


        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);


        System.out.println();
        System.out.println("===============================");
        System.out.println("Exercise 5");
        System.out.println("===============================");


        // Orders
        Order order1 = new Order(101);
        Order order2 = new Order(102);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);

        order2.addProduct(product3);

        // Show results
        System.out.println(order1);
        System.out.println(order2);


            }
        }



