package com.example.lab8;// CustomListTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.example.lab8.City;
import com.example.lab8.CustomList;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList() {
        return new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount(), "Initial city count should be zero.");
        City cityToAdd = new City("Nanton", "AB");
        list.add(cityToAdd);
        assertEquals(1, list.getCount(), "The city was not added.");
    }

    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City cityToAdd = new City("Nanton", "AB");
        list.add(cityToAdd);
        assertTrue(list.hasCity(cityToAdd), "The list should contain the added city.");
        assertFalse(list.hasCity(new City("Calgary", "AB")), "The list should not contain a city that wasn't added.");
    }

    @Test
    public void deleteCityTest() {
        CustomList list = MockCityList();
        City cityToDelete = new City("Nanton", "AB");
        list.add(cityToDelete);
        list.deleteCity(cityToDelete);
        assertFalse(list.hasCity(cityToDelete), "The city was not deleted.");
    }

    @Test
    public void countCitiesTest() {
        CustomList list = MockCityList();
        assertEquals(0, list.getCount(), "Initial city count should be zero.");
        list.add(new City("Nanton", "AB"));
        list.add(new City("Calgary", "AB"));
        assertEquals(2, list.getCount(), "City count should reflect the number of cities added.");
    }
}
