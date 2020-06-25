package com.itstep.myHomework;

import java.util.Random;

public class Item {
    private long itemId;

   private String itemTitle;

   private Type itemType;
   private double price;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Type getItemType() {
        return itemType;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

    public Item(String itemTitle, Type itemType){
       Random random=new Random();
       this.itemId=random.nextInt(10000);
       this.itemTitle=itemTitle;
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
