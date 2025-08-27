package src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Boutique
        Boutique myBoutique = new Boutique(1, "Sara", "Elegance Boutique", "Women Clothing", "Specializes in formal wear", "Cairo");
        System.out.println("Boutique Name: " + myBoutique.getBoutiqueName());
        System.out.println("Owner: " + myBoutique.getOwnerName());

        // Product
        Product p = new Product(101, "Evening Dress", "Formal", 1200.0, 10);
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Product Price: " + p.getPrice());

        // Customer
        Customer c = new Customer(1, "Mona Ahmed", "mona22", "pass1234", "mona@gmail.com", "01012345678", "Nasr City, Cairo");
        System.out.println("Customer: " + c.getCustomerName());
        System.out.println("Username: " + c.getUsername());
        System.out.println("Address: " + c.getAddress());

        // Stock
        Stock s = new Stock(1, p.getProductId(), 8);
        System.out.println("Stock for Product ID " + s.getProductId() + ": " + s.getAvailableQuantity() + " items");

        // Sales
        Sales sale = new Sales(1, p.getProductId(), c.getCustomerId(), 2, new Date());
        System.out.println("Sale ID: " + sale.getSaleId());
        System.out.println("Quantity Sold: " + sale.getQuantitySold());
        System.out.println("Sale Date: " + sale.getSaleDate());

        // User
        User u = new User(1, "admin1", "adminpass", "Admin", "admin@store.com");
        System.out.println("User: " + u.getUsername() + " | Role: " + u.getRole());
    }
}
