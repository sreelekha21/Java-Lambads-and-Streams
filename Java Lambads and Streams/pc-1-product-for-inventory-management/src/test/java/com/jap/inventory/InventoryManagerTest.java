package com.jap.inventory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryManagerTest {

    Product product1;
    // Create an instance of InventoryManager
    InventoryManager inventoryManager;
    @Before
    public void setUp(){
        // Create a new Product object
        product1= new Product(101, "Laptop", 999.99);
        inventoryManager = new InventoryManager();
    }

    @After
    public void tearDown(){
        product1 = null;
    }

    @Test
    public void testAddNewProduct() {

        // Add the product to the inventory with quantity 5
        int updatedQuantity = inventoryManager.addOrUpdateProduct(product1, 5);

        // Verify that the product is added to the inventory
        assertEquals(5, updatedQuantity);

        // Verify that the inventory size is 1
        assertEquals(1, inventoryManager.getInventorySize());
    }

    @Test
    public void testUpdateExistingProduct() {
        // Add the product to the inventory with quantity 5
        inventoryManager.addOrUpdateProduct(product1, 5);

        // Update the quantity of the existing product to 10
        int updatedQuantity = inventoryManager.addOrUpdateProduct(product1, 5);

        // Verify that the quantity of the product is updated
        assertEquals(10, updatedQuantity);

        // Verify that the inventory size is still 1
        assertEquals(1, inventoryManager.getInventorySize());
    }

    @Test
    public void testRemoveExistingProduct() {
        // Create an instance of InventoryManager
        InventoryManager inventoryManager = new InventoryManager();

        // Create a new Product object
        Product product = new Product(101, "Laptop", 999.99);

        // Add the product to the inventory with quantity 5
        inventoryManager.addOrUpdateProduct(product, 5);

        // Verify that the product exists in the inventory
        assertEquals(true, inventoryManager.getInventory().containsKey(product));

        // Remove the product from the inventory
        boolean isRemoved = inventoryManager.removeProduct(product);

        // Verify that the product is removed and the method returns true
        assertEquals(true, isRemoved);

        // Verify that the product no longer exists in the inventory
        assertEquals(false, inventoryManager.getInventory().containsKey(product));

        // Verify that the inventory size is 0
        assertEquals(0, inventoryManager.getInventorySize());
    }




}