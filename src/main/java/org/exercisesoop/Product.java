package org.exercisesoop;

public class Product {

    // Private fields

    private int productId;
    private String productName;
    private double price;

    // constructor

    public Product(int productId, String productName, double price) {
        this.productId = productId;

        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }

        this.productName = productName;

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
    public int getProductId() {return productId; }

    public String getProductName() { return productName; }

    public double getPrice() { return price; }

    // Setters
    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product ID: " + productId + ", Product name: " + productName + ", Price: $ " + price;

        /*
        +-------------------------+
        |         Product         |
        +-------------------------+
        | - productId: int        |
        | - productName: String   |
        | - price: double         |
        +-------------------------+
        | + Product( id, productName, price)  |
        | + getProductId(): int               |
        | + getProductName(): String          |
        | + getPrice(): double                |
        | + setProductName(productName): void |
        | + setPrice(price): void             |
        | + toString(): String                |
        +------------------------------------+

         */
    }
}
