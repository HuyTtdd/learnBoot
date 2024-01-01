package com.example.blog.services;

import com.example.blog.models.User;

public class UserServices {
    public User createUser(String userName) {
        return new User("user1");
    };

    public User getUser(String ID) {
        return new User("user1");
    }
}
