package com.jap.customers;


import java.util.*;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){

    // Sort the customer list using the comparator
    customerList.sort(loyaltyPointComparator);

    // Extract loyalty points in sorted order
    List<Integer> loyaltyPointsList = new ArrayList<>();
    for (Customer customer : customerList) {
        loyaltyPointsList.add(customer.getLoyaltyPoints());
    }

    return loyaltyPointsList;
}

}
