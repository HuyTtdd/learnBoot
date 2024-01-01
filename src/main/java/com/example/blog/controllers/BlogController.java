package com.example.blog.controllers;

import com.example.blog.models.Blog;
import com.example.blog.models.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class BlogController {
    @Autowired
    private BlogRepository blogRepo;
    @GetMapping("/blogs")
    public Blog getBlogs() {
        return new Blog("1", "blog1", "this is the content of blog1", "1");}
}
