package com.itstep.may;

import java.util.Random;

public class Item {
    public long itemId;
    public String itemTitle;
    public Type itemType;

    public Item(String title, Type itemType) {
        Random random=new Random();
        this.itemId=random.nextInt();
        this.itemTitle = itemTitle;
        this.itemType=itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemType=" + itemType +
                '}';
    }
}
