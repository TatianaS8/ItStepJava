package com.itstep.myHomework;

public class Address {
    private String country;

    private String city;

    private String street;

    protected Address(String country, String city, String street){
        this.country=country;
        this.city=city;
        this.street=street;
    }

    protected String getFullAddress(){
        return "Address: "+ street+ "," + city+ "," + street;
    }





    }
