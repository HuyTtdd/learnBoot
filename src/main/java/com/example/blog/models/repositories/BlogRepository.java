package com.example.blog.models.repositories;

import com.example.blog.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}