package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class ElectronicListServiceTest {
    @Test
    public void testAddItemsToList() {
        List<String> list = ElectronicListService.addElectronicsItemsToList("computer, Refrigerator, smartphone, printer, Refrigerator");
        assertEquals("Expected list size without duplicates", 4, list.size());
        assertTrue("List should contain 'Refrigerator'", list.contains("Refrigerator"));
    }

    @Test
    public void testSearchItemInList() {
        List<String> list = ElectronicListService.addElectronicsItemsToList("computer, Refrigerator, smartphone, printer");
        int index = ElectronicListService.searchElectronicItemInList(list, "smartphone");
        assertEquals("Expected index of 'smartphone' is 2", 2, index);
    }

    @Test
    public void testRemoveItemFromList() {
        List<String> list = ElectronicListService.addElectronicsItemsToList("computer, Refrigerator, smartphone, printer");
        boolean removed = ElectronicListService.removeElectronicsItemFromList(list, "printer");
        assertTrue("Printer should be removed", removed);
        assertFalse("List should no longer contain 'printer'", list.contains("printer"));
    }
    @Test
    public void givenDuplicateNamesAsInputParameterThenReturnListWithUniqueItems() {
        List<String> list = ElectronicListService.addElectronicsItemsToList("TV, AC, TV, Fan");
        assertEquals("Duplicates should be removed", 3, list.size());
        assertTrue(list.contains("TV"));
        assertTrue(list.contains("AC"));
        assertTrue(list.contains("Fan"));
    }

}