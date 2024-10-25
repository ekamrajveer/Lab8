package com.example.lab8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    // MockCityList method for creating a CustomList without needing a real Android context
    public CustomList MockCityList() {
        return new CustomList(null, new ArrayList<City>());  // Passing null for Context
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount(), "Initial city count should be zero.");
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);  // Using the custom addCity method
        assertEquals(1, list.getCount(), "The city was not added.");
    }

    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);  // Using the custom addCity method
        assertTrue(list.hasCity(cityToAdd), "The list should contain the added city.");
        assertFalse(list.hasCity(new City("Calgary", "AB")), "The list should not contain a city that wasn't added.");
    }

    @Test
    public void deleteCityTest() {
        CustomList list = MockCityList();
        City cityToDelete = new City("Nanton", "AB");
        list.addCity(cityToDelete);  // Using the custom addCity method
        list.deleteCity(cityToDelete);
        assertFalse(list.hasCity(cityToDelete), "The city was not deleted.");
    }

    @Test
    public void countCitiesTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount(), "Initial city count should be zero.");
        list.addCity(new City("Nanton", "AB"));
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.getCount(), "City count should reflect the number of cities added.");
    }
}
