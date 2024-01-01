package com.example.blog.controllers;

import com.example.blog.models.Comment;
import com.example.blog.models.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class CommentController {
    @Autowired
    private CommentRepository commentRepo;

    @GetMapping("/comments")
    public Comment getComments() {
        return new Comment("1", "this is content of comment 1", "1","1");}
}
