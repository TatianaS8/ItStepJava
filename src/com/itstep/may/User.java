package com.itstep.may;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User {
    public long userId;
    public String userName;
    public Map<String, Address>userAddresses;

    public User(String userName) {
        Random random=new Random();
        this.userId=random.nextInt();
        this.userName = userName;
        this.userAddresses=new HashMap<>();
    }
    public void addAddress(String location, Address address) {
        userAddresses.put(location, address);
    }
}
