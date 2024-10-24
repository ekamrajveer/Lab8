package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList(){
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be not zero.");
        City cityToAdd = new City("Nanton", "AB");
        list.add(cityToAdd);

        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "The city was not added.");
    }


}
