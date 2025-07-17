package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    private static final String ITEM_REFRIGERATOR = "Refrigerator";

    // Private constructor to prevent instantiation
    private ElectronicListService() {
        throw new UnsupportedOperationException("Utility class");
    }

    // Add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(final String electronicsItems) {
        final List<String> itemList = new ArrayList<>();
        for (final String item : electronicsItems.split(",")) {
            final String trimmedItem = item.trim();
            if (!itemList.contains(trimmedItem)) {
                itemList.add(trimmedItem);
            }
        }
        return itemList;
    }

    // Search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(final List<String> itemList, final String searchItem) {
        return itemList.indexOf(searchItem);
    }

    // Remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(final List<String> itemList, final String removeItem) {
        final Iterator<String> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(removeItem)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }


}
