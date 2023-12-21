package com.example.blog.controllers;

import com.example.blog.models.Blog;
import com.example.blog.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @GetMapping("/blogs")
    public Blog getBlogs() {
        return new Blog("1", "blog1", "this is the content of blog1", "1");}
}
