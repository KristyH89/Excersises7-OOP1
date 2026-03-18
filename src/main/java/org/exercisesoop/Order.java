package org.exercisesoop;
import java.util.ArrayList;
import java.util.List;

public class Order {

    // Private fields
    private int orderId;
    private List<Product> products;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getter
    public int getOrderId(){
        return orderId;
    }

    public List<Product> getProducts(){
        return products;
    }
    // Add product
    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    // Remove product
    public void removeProduct(Product p) {
        products.remove(p);
    }
    // Calculate total price
    public double calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Number of products: " + products.size() + ", Total: $" + String.format("%.2f", calculateTotal());
    }

}
