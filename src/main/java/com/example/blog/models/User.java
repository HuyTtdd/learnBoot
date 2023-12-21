package com.example.blog.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class User {
    private final String ID;
    private String userName;
    private Set<String> blogs = new HashSet<>();
    private Set<String> comments = new HashSet<>();

    public void addBlogs(String blogID) {
        this.blogs.add(blogID);
    }

    public Set<String> getBlogs() {
        return blogs;
    }

    public Set<String> getComments() {
        return comments;
    }

    public void addComments(String commentID) {
        this.comments.add(commentID);
    }

    public String getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public User(String ID, String userName) {
        this.ID = ID;
        this.userName = userName;
    }
}
