package com.jap.customers;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList){

    List<String> customerNames = new ArrayList<>();

    // Step 1: Extract customer names from the Customer list
    for (Customer customer : customerList) {
        customerNames.add(customer.getCustomerName());
    }

    // Step 2: Sort the list of names alphabetically (ascending order)
    Collections.sort(customerNames);

    return customerNames;
}


}
