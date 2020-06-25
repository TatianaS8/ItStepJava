package com.itstep.homework;

public class Address2020 implements Comparable<Address2020> {
    private String country;
    private String city;
    private String street;
    private int number;

    public Address2020(String country, String city,String street, int number) {
        this.city = city;
        this.country=country;
        this.street=street;
        this.number=number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address2020{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}'+"\n";
    }

    @Override
    public int compareTo(Address2020 anotherAddress2020) {
        return this.number-anotherAddress2020.number;
    }
}
