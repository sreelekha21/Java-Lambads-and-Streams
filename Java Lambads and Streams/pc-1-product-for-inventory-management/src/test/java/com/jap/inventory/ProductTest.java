package com.jap.inventory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {


    @Test
    public void testConstructorAndGetters() {
        // Create a Product object
        Product product = new Product(101, "Laptop", 999.99);

        // Test the getters
        assertEquals(101, product.getProductId());
        assertEquals("Laptop", product.getName());
        assertEquals(999.99, product.getPrice(), 0.01); // delta is used for double comparison
    }

    @Test
    public void testEquals() {
        // Create two Product objects with the same productId
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(101, "Desktop", 899.99);

        // Test equals() method
        assertEquals(true, product1.equals(product2));
    }


    @Test
    public void testHashCode() {
        // Create two Product objects with the same productId
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(101, "Desktop", 899.99);

        // Test hashCode() method
        assertEquals(product1.hashCode(), product2.hashCode());
    }




}
