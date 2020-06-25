package com.itstep.myHomework;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserOrder implements Order {
    private long orderId;
    private User orderUser;
    private List<Item> orderItems;

    public UserOrder(User orderUser, List<Item> orderItem) {
        this.orderId = new Random().nextLong();
        this.orderUser = orderUser;
        this.orderItems = orderItems;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }

    public List<Item> filterItemsByType(Type type) {
        List<Item> filteredItems = new ArrayList<>();
        for (int i = 0; i < orderItems.size(); i++) {
            Item tempItem = orderItems.get(i);
            if (tempItem.getItemType().equals(type)) {
                filteredItems.add(tempItem);
            }
        }
        return filteredItems;

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderUser=" + orderUser +
                ", orderItems=" + orderItems +
                '}';
    }


    @Override
    public double sum() {
        double total = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            double itemPrice = orderItems.get(i).getPrice();
            total += itemPrice;}
            return total;
        }

        @Override
        public double count() {
            return orderItems.size();
        }
    }



