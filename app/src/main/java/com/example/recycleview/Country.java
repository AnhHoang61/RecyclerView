package com.example.recycleview;

public class Country {
    private int flat;
    private String name;
    private String countryCapial;

    public Country(int flat, String name, String countryCapial) {
        this.flat = flat;
        this.name = name;
        this.countryCapial = countryCapial;
    }

    public int getFlat() {
        return flat;
    }

    public String getName() {
        return name;
    }

    public String getCountryCapial() {
        return countryCapial;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCapial(String countryCapial) {
        this.countryCapial = countryCapial;
    }
}
