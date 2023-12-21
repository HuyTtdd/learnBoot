package com.example.blog.controllers;

import com.example.blog.models.Blog;
import com.example.blog.models.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @GetMapping("/comments")
    public Comment getComments() {
        return new Comment("1", "this is content of comment 1", "1","1");}
}
