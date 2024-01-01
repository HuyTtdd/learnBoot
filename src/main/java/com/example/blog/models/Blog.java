package com.example.blog.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name="blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private final String id;
    private String title;
    private String content;
    private final String userID;
    private Set<String> comments = new HashSet<>();

    public String getUserID() {
        return userID;
    }

    public Set<String> getComments() {
        return comments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addComments(String commentID) {
        this.comments.add(commentID);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    public Blog(String ID, String title, String content, String userID) {
        this.id = ID;
        this.title = title;
        this.content = content;
        this.userID = userID;
    }
}
