package com.jap.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MobileStockService {
    //Display all the products
    public void displayAllProducts(List<Mobile> mobileList) {
        for (Mobile mobile : mobileList) {
            System.out.println(mobile);
        }

    }

    // This method will filter by the brand name
    public List<Mobile> filterByBrandName(List<Mobile> mobiles, Predicate<Mobile> pre) {

        return mobiles.stream()
                .filter(pre)
                .collect(Collectors.toList());
    }

    //Calculate total invoice amount for a particular brand of phone
    public double calculateInvoiceAmountForABrand(List<Mobile> mobileList) {
       // Use the Function Interface to perform the calculations
        Function<List<Mobile>, Double> invoiceCalculator = list -> {
            double total = 0;
            for (Mobile mobile : list) {
                total += mobile.getAmount() * mobile.getQuantity();
            }
            return total;
        };

        return invoiceCalculator.apply(mobileList);
    }
    }



