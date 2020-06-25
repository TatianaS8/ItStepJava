package com.itstep.HumanAddressJob;

public class Address {
    String street;
    int houseNumber;
    String city;
    String country;

    public Address (String street, int houseNumber, String city, String country){
        this.street=street;
        this.houseNumber=houseNumber;
        this.city=city;
        this.country=country;
    }
    public String addressInformation(){ return "Address; "+ street+","+ houseNumber+","+ city+","+country;}

    }


