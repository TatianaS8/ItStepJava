package com.itstep.Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User extends com.itstep.myHomework.User {
    public long userId;

    public String username;

    public Map<String, Address> userAddresses;




    public User(String username) {
        super(username);
        Random random = new Random();
        this.userId = random.nextInt(10000);
        this.username = username;
        this.userAddresses = new HashMap<>();

    }

    public void addAddress(String location, Address address) {
        userAddresses.put(location, address);
    }
}

//    public String  userInformation(){
//        return id+user_name;
//    }
//
//    public static void main(String[] args) {
//        HashMap<String,String>addressMap=new HashMap<>();
//        addressMap.put("Home", Address.address1);
//
//    }
//
//    }





