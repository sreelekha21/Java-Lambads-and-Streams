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
    @Before
    public void setUp() {
        System.out.println("Setup before each test");
    }

    @After
    public void tearDown() {
        System.out.println("Cleanup after each test");
    }

    @Test
    public void givenDuplicateNamesAsInputParameterThenReturnListWithUniqueItems() {
        List<String> expected = Arrays.asList("computer", "Refrigerator", "smartphone", "printer");
        List<String> actual = ElectronicListService.addElectronicsItemsToList("computer, Refrigerator, smartphone, printer");

        assertEquals("Expected and actual lists do not match", expected, actual);
    }

}
