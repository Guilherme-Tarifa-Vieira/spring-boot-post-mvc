package com.spring.blogspring.services.serviceImpl;

import com.spring.blogspring.models.Post;
import com.spring.blogspring.repositories.PostRepository;
import com.spring.blogspring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {


    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }


    @Override
    public Post findById(long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}
