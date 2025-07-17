package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    // Add all the electronic items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String[] items = electronicsItems.split(",");

        for (String item : items) {
            item = item.trim();
            if (!itemList.contains(item)) { // add only if not already present
                itemList.add(item);
            }
        }

        return itemList;
    }

    // Search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    // Remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        boolean isRemoved = false;

        Iterator<String> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals(removeItem)) {
                iterator.remove();
                isRemoved = true;
                break; // stop after removing
            }
        }

        return isRemoved;
    }


}
