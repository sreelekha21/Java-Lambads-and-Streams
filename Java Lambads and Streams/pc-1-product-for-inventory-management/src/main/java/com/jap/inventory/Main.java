package com.jap.inventory;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of InventoryManager
        InventoryManager inventoryManager = new InventoryManager();

        // Create six some Product objects
        Product p1 = new Product(101, "Laptop", 999.99);

        Product p2 = new Product(102, "Mouse", 120.50);
        Product p3 = new Product(103, "Keyboard", 220.75);
        Product p4 = new Product(104, "Monitor", 1850.00);
        Product p5 = new Product(105, "Printer", 970.00);
        Product p6 = new Product(106, "USB Drive", 600.00);

        // Add all the products to the inventory call addOrUpdateProduct method to add and update4
        inventoryManager.addOrUpdateProduct(p1, 10);
        inventoryManager.addOrUpdateProduct(p2, 20);
        inventoryManager.addOrUpdateProduct(p3, 15);
        inventoryManager.addOrUpdateProduct(p4, 25);
        inventoryManager.addOrUpdateProduct(p5, 30);


        // Display inventory before details
//        System.out.println("Inventory Details:");
        displayInventoryDetails(inventoryManager);

        // call the remove method to remove a product from the inventory
        inventoryManager.removeProduct(p2);

        // Display inventory details after removal
        System.out.println("After removal:");
        displayInventoryDetails(inventoryManager);

        // Retrieve a product by ID
        int productIdToFind = 102;
        Product found = inventoryManager.getProductById(103);
        if (found != null) {
            System.out.println("Found product: " + found.name);
        }


        //Size of inventory
        System.out.println("Inventory size: " + inventoryManager.getInventorySize());
    }

    // Method to display inventory details
    private static void displayInventoryDetails(InventoryManager inventoryManager) {
        Map<Product, Integer> inventory = inventoryManager.getInventory();

        // Iterate through the Map object to get Product and its Quantity
        for (Map.Entry<Product, Integer> entry : inventoryManager.getInventory().entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();
            System.out.println(p.productId + " | " + p.name + " | ₹" + p.price + " | Qty: " + qty);
        }

    }
}
