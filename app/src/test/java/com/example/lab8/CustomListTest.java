package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList() {
        // Create a mock CustomList with no initial data
        return new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount(), "Initial city count should be zero.");

        City cityToAdd = new City("Nanton", "AB");
        list.add(cityToAdd);  // This method does not exist yet, so test will fail
        assertEquals(1, list.getCount(), "The city was not added.");
    }

    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City cityToAdd = new City("Nanton", "AB");
        list.add(cityToAdd);  // This method does not exist yet, so test will fail

        assertTrue(list.hasCity(cityToAdd), "The list should contain the added city.");
        assertFalse(list.hasCity(new City("Calgary", "AB")), "The list should not contain a city that wasn't added.");
    }

    @Test
    public void deleteCityTest() {
        CustomList list = MockCityList();
        City cityToDelete = new City("Nanton", "AB");
        list.add(cityToDelete);  // This method does not exist yet, so test will fail

        list.deleteCity(cityToDelete);  // This method does not exist yet, so test will fail
        assertFalse(list.hasCity(cityToDelete), "The city was not deleted.");
    }

    @Test
    public void countCitiesTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount(), "Initial city count should be zero.");

        list.add(new City("Nanton", "AB"));  // This method does not exist yet, so test will fail
        list.add(new City("Calgary", "AB"));  // This method does not exist yet, so test will fail
        assertEquals(2, list.getCount(), "City count should reflect the number of cities added.");
    }
}
