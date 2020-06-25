package com.itstep.Lesson6.task5;

public class Address {
    String country;
    String city;
    String street;
    int houseNumber;


    public Address (String country, String city, String street, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public void address(){
        System.out.println(country+city+street+ houseNumber);


    }
}







//
//    public Address (String country, String city, String street, String houseNumber ) {
//
//
//        this.country = country;
//        this.city = city;
//        this.street = street;
//        this.houseNumber = houseNumber;
//        System.out.println();
//
//    }
//
//
//    public static void main(String[] args) {
//
//        Address address1;
//        address1=new Address("United States", "New York", "Bryant Park","65");
//
//        System.out.println(Address);
//    }
//}
