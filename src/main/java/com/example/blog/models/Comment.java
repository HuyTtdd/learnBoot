package com.example.blog.models;

import jakarta.persistence.*;
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final String id;
    private String content;

    private final String userID;
    private final String blogID;
    public Comment(String ID, String content, String userID, String blogID) {
        this.id = ID;
        this.content = content;
        this.userID = userID;
        this.blogID = blogID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getUserID() {
        return userID;
    }

    public String getBlogID() {
        return blogID;
    }
}
