package com.example.blog.models;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
@Entity
@Table(name="\"users\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private Set<String> blogs = new HashSet<>();
    private Set<String> comments = new HashSet<>();

    public void addBlogs(String blogID) {
        this.blogs.add(blogID);
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User() {}
}
