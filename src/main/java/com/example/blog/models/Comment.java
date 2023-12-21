package com.example.blog.models;

import java.util.HashSet;
import java.util.Set;

public class Comment {
    private final String ID;
    private String content;

    private final String userID;
    private final String blogID;
    public Comment(String ID, String content, String userID, String blogID) {
        this.ID = ID;
        this.content = content;
        this.userID = userID;
        this.blogID = blogID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getID() {
        return ID;
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
