package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        String[] itemsArray = electronicsItems.split(",\\s*");
        List<String> itemList = new ArrayList<>();

        for (String item : itemsArray) {
            if (!itemList.contains(item)) {
                itemList.add(item);
            }
        }
        return itemList;
    }

    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        Iterator<String> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(removeItem)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Optional: private constructor to enforce utility class
    private ElectronicListService() {
        throw new UnsupportedOperationException("Utility class");
    }
}


