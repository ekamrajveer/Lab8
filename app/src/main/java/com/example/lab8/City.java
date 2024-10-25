package com.example.lab8;

import java.util.Objects;

public class City {

    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return this.city;
    }

    public String getProvinceName() {
        return this.province;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        City cityObj = (City) obj;
        return city.equals(cityObj.city) && province.equals(cityObj.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
