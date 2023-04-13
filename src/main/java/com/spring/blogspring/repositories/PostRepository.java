package com.spring.blogspring.repositories;

import com.spring.blogspring.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
