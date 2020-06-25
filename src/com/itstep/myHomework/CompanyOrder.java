package com.itstep.myHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompanyOrder implements Order {
    private long orderId;
    private Company company;
    private List<Item> companyItem;

    public CompanyOrder (Company company,  List<Item> companyItem) {
        this.orderId = new Random().nextLong();
        this.company = company;
        this.companyItem = companyItem;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Item> getCompanyItem() {
        return companyItem;
    }

    public void setCompanyItem(List<Item> companyItem) {
        this.companyItem = companyItem;
    }

    public List<Item> filterItemsByType(Type type) {
        List<Item> filteredItems = new ArrayList<>();
        for (int i = 0; i < companyItem.size(); i++) {
            Item tempItem = companyItem.get(i);
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
                ", orderUser=" + company +
                ", orderItems=" + companyItem +
                '}';
    }


    @Override
    public double sum() {
        double total = 0;
        for (int i = 0; i < companyItem.size(); i++) {
            double itemPrice = companyItem.get(i).getPrice();
            total += itemPrice;}
        return total;
    }

    @Override
    public double count() {
        return companyItem.size();
    }


    public double sum (Item item){
        double total = 0;
        for (int i = 0; i < companyItem.size(); i++) {
            Item currentItem=companyItem.get(i);

            if (item.getItemType().equals(currentItem.getItemType())){
            double itemPrice = currentItem.getPrice();
            total += itemPrice;}  }
        return total;

    }
    public double count (Item item){
        return filterItemsByType(item.getItemType()).size();
    }
}




