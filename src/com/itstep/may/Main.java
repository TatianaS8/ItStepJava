package com.itstep.may;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Moldova", "Chisinau", "Ismail");
        System.out.println(address.getFullAddress());

        Address address1 = new Address("Moldova", "Orhei", "Morilor");
        System.out.println(address1.getFullAddress());

        Item item=new Item ("clothes 1", Type.CLOTHES);
        Item item1=new Item("toy 1", Type.TOY);
        Item item2=new Item ("gadget 1", Type.GADGET);


    }
}

