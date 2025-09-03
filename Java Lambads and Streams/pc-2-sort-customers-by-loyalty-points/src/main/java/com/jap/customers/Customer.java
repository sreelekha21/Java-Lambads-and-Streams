package com.jap.customers;

public class Customer{
private int customerId;
private String customerName;
private String customerGender;
private boolean isSeniorCitizen;
private String city;
private int loyaltyPoints;

    public int getCustomerId() {
        return customerId;
    }

    public Customer(int customerId, String customerName, String customerGender, boolean isSeniorCitizen, String city, int loyaltyPoints) {
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerGender=customerGender;
        this.isSeniorCitizen=isSeniorCitizen;
        this.city=city;
        this.loyaltyPoints=loyaltyPoints;

    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public boolean isSeniorCitizen() {
        return isSeniorCitizen;
    }

    public String getCity() {
        return city;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", isSeniorCitizen=" + isSeniorCitizen +
                ", city='" + city + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}
