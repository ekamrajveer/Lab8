package com.example.lab8;

import java.util.Objects;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City other = (City) obj;
        return Objects.equals(this.city, other.city) &&
                Objects.equals(this.province, other.province);
    }
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}
