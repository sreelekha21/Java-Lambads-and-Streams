package com.jap.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Product, Integer> inventory;

    // Constructor
    public InventoryManager() {
        inventory = new HashMap();
    }

    // Method to add or update product quantity
    public int addOrUpdateProduct(Product product, int quantity) {

        // If product exists, update quantity
        if (inventory.containsKey(product)) {
            int updatedQuantity = inventory.get(product) + quantity;
            inventory.put(product, updatedQuantity);
            return updatedQuantity;
        } else {
            inventory.put(product, quantity);
            return quantity;
        }
    }

    // Method to remove a product from inventory
    public boolean removeProduct(Product product) {
        if(inventory.containsKey(product))
        {
            inventory.remove(product);
            return  true;
        }
       return false;
    }

    // Method to retrieve a product by ID
    public Product getProductById(int productId) {
        for (Product product : inventory.keySet()) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;

    }

    // Method to get the size of the inventory map
    public int getInventorySize() {
        return inventory.size();
    }
    public Map<Product, Integer> getInventory() {
        return inventory;
    }
}
