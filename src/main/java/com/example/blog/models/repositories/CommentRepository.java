package com.example.blog.models.repositories;


import com.example.blog.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}