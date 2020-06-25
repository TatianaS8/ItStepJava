package com.itstep.myHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class AbstractUser  {
    protected long userId;
    protected   String username;
    protected Map<String, Address> userAddress;

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public Map<String, Address> getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Map<String, Address> userAddress) {
        this.userAddress = userAddress;
    }

    public AbstractUser(String username, Map<String, Address>userAddress){
        Random random=new Random();
        this.userId=random.nextInt(10000);
        this.username=username;
        this.userAddress=userAddress;
    }
    public AbstractUser (String username) {
        Random random = new Random();
        this.userId = random.nextInt(10000);
        this.username = username;
        this.userAddress = new HashMap<>();
    }
    public void addAddress(String location, Address address) {
        userAddress.put(location, address);
    }

}
