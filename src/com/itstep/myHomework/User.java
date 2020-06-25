package com.itstep.myHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User extends AbstractUser {


    public User(String username) {
        super(username);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                '}';
    }
}
