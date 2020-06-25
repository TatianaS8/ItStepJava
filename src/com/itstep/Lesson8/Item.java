package com.itstep.Lesson8;

import java.util.Random;

public class Item {
    public long itemId;

    public String itemTitle;

    public Type itemType;


    public Item(String itemTitle, Type itemType){
        Random random=new Random();
        this.itemId= random.nextInt(10000);
        this.itemTitle=itemTitle;
        this.itemType=itemType;
    }
    public String toString(){
        return "Item{"+
                "itemId="+itemId+
                ",itemTitle="+itemTitle+'\''+
                ", itemType="+itemType+
                '}';
    }

}
