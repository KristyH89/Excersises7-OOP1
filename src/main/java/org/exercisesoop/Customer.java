package org.exercisesoop;

public class Customer {

    private int customerId;
    private String name;
    private String email;

    // constructor

    public Customer(int customerID, String name, String email) {
        this.customerId = customerID;

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }
    // Getters

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    //Setters (safe update)
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Email: " + email;
    }

}

/*
+---------------------------+
|        Customer           |
+---------------------------+
| - customerId: int         |
| - name: String            |
| - email: String           |
+---------------------------+
| + Customer(id, name, email) |
| + getCustomerId(): int    |
| + getName(): String       |
| + getEmail(): String      |
| + setName(name): void     |
| + setEmail(email): void   |
| + toString(): String      |
+---------------------------+
 */