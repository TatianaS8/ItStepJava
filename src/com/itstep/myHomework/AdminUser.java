package com.itstep.myHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AdminUser extends AbstractUser {


    public AdminUser(String username) {
        super(username);
    }

    public void approveOrder(Order order){
        System.out.println("Order approved");
    }
    public void rejectOrder(Order order){
        System.out.println("Order rejected");
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "userId=" + userId +
                '}';
    }
}
