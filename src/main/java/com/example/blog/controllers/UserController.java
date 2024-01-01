package com.example.blog.controllers;


import com.example.blog.models.User;
import com.example.blog.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable int id) {
//        return userRepo.findById(id).orElseThrow(() -> new HttpClientErrorException.BadRequest());
        return userRepo.findById(id);
    }

    @GetMapping("/users")
    public List<User> getUserList() {
        return userRepo.findAll();
    }

    @DeleteMapping("/users/{id}")
    public Optional<User> removeUser(@PathVariable int id) {
        Optional<User> user = userRepo.findById(id);
        userRepo.deleteById(id);
        return user;
    }
}
