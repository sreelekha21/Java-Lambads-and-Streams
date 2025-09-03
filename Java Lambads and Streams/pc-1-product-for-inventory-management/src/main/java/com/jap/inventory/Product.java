package com.jap.inventory;

import java.util.Objects;

public class Product {
    // create variable
    int productId;
    String name;
    double price;

    // create constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;

    }

    // Getters
    public int getProductId() {

        return productId;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {
        return price;
    }

    // Override equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    //  Override hashCode() method
    @Override
    public int hashCode() {
        return productId;
    }

//    @Override
//    public String toString() {
//        return "Product ID: " + productId + ", Name: " + name + ", Price: " + price;
//    }

}
