package com.example.blog.controllers;


import com.example.blog.models.User;
import com.example.blog.services.UserServices;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserServices userService = new UserServices();
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getUserName());
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }
}
