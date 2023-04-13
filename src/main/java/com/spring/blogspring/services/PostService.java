package com.spring.blogspring.services;

import com.spring.blogspring.models.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    Post findById(long id);

    Post savePost(Post post);


}
