package com.example.example1.service;

import com.example.example1.Repository.PostRepository;
import com.example.example1.entity.Post;
import com.example.example1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService implements IPostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> getAllPostOfUser(User user) {
        return postRepository.findByAuthor(user);
    }

    @Override
    public Post getPostById(Long id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElse(null);
    }

    @Override
    public void addPostIntoUser(Post post) {
        postRepository.save(post);
    }

    @Override
    public Post editPostById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }
}
