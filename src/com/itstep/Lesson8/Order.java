package com.itstep.Lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    //Attributes/Class properties

    public long orderId;
    public User orderUser;
    public List<Item> orderItems;///3 items

    //Constructor

public Order( User orderUser, List<Item> orderItems ) {
    this.orderId=new Random().nextLong();
    this.orderUser=orderUser;
    this.orderItems=orderItems;
}
//methods
    public List<Item>filterItemsByType(Type type){
    List<Item>filteredItems=new ArrayList<>();

    for (int i=0; i<orderItems.size();i++){       //for(Item tempItem:orderItem){
        Item tempItem=orderItems.get(i);

        if (tempItem.itemType.equals(type)){
            filteredItems.add(tempItem);
        }
    }
    return filteredItems;
    }


    public String toString(){
            return "Order{"+
                    "orderId="+orderId+
                    ",orderUser="+orderUser+'\''+
                    ", orderItems="+orderItems+
                    '}';
    }


}

