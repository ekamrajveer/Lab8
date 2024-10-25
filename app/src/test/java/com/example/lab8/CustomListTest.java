package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Nanton", "AB"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void hasCityTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "AB"));
        assertTrue(list.hasCity(new City("Edmonton", "AB")));
        assertFalse(list.hasCity(new City("Calgary", "AB")));
    }
    @Test
    public void testDeleteCityExists() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testDeleteCityDoesNotExist() {
        list = MockCityList();
        City city = new City("Calgary", "AB");
        assertThrows(NoSuchElementException.class, () -> list.deleteCity(city));
    }
    @Test
    public void testCountCities() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.getCount());
    }

}
