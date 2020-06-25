package com.itstep.Lesson8;

import java.util.*;

//import java.util.Random;
public class World {
    public static void main(String[] args) {

        Address address=new Address("Moldova", "Chisinau", "Ismail");
        System.out.println(address.getFullAddress());
//        System.out.println(address.country);
//        System.out.println(address.city);
//        System.out.println(address.street);
        Address address1=new Address("Moldova", "Orhei", "P.Rares");
        System.out.println(address1.getFullAddress());

//        User user=new User("smith@gmail.com");
//        System.out.println(user.userId);
//        System.out.println(user.username);
//        System.out.println(user.userAddresses);//empty
//
//        user.addAddress("HOME", address);
//        user.addAddress("WORK", address1);
//        System.out.println(
//                user.userAddresses.get("HOME").getFullAddress());//has address
//        System.out.println(
//                user.userAddresses.get("WORK").getFullAddress()); // has address

        Map<String, Address> user1Addresses=new HashMap<>();
        user1Addresses.put("HOME", address1);
        user1Addresses.put("WORK", address);

        User user1=new User("David@gmail.com");
        System.out.println(user1.userId);
        System.out.println(user1.username);

//        System.out.println(
//                user1.userAddresses.get("HOME").getFullAddress());//has address
//        System.out.println(
//                user1.userAddresses.get("WORK").getFullAddress()); // has address

        user1.addAddress("HOME", new Address("Moldova", "Chisinau", "str.Decebal"));

//        System.out.println(
//                user1.userAddresses.get("HOME").getFullAddress());//has address

        List<Item> order1Items=new ArrayList<>();

        Item babyDoll=new Item("Baby Doll", Type.TOYS);
        order1Items.add(babyDoll);

        Item car=new Item("Car", Type.TOYS);
        order1Items.add(car);

        Item tShirt=new Item("T-Shirt", Type.CLOTHES);
        order1Items.add(tShirt);

        Order order1=new Order(user1, order1Items);

        List <Item> filtredToys=order1.filterItemsByType(Type.TOYS);
        System.out.println(filtredToys);

        User user2=new User("mollysmith@gmail.com");

        List<Item>itemsSecondList=new ArrayList<>();

        Item phone=new Item("IPhone",Type.GADGETS);
        itemsSecondList.add(phone);

        Order order2 =new Order(user2, itemsSecondList);

        List<Order>allOrders=new ArrayList<>();
        Collections.addAll(allOrders, order1, order2);

        List<Order>filteredOrders=filterOrdersByType(Type.TOYS, allOrders);
        System.out.println(filteredOrders);
    }
    static List<Order>filterOrdersByType(Type type, List<Order> orders){
        List<Order>filteredOrders=new ArrayList<>();

        for (Order tempOrder:orders){
            List<Item>itemsByType=tempOrder.filterItemsByType(type);
            if (!itemsByType.isEmpty()) {

                filteredOrders.add(tempOrder);
            }
        }
        return filteredOrders;
    }
}
