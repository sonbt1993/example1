package com.example.example1.service;

import com.example.example1.entity.User;
import com.example.example1.entity.Post;

import java.util.List;

public interface IPostService {
    List<Post> getAllPost();
    List<Post> getAllPostOfUser(User user);

    Post getPostById(Long id);
    void addPostIntoUser(Post post);
    Post editPostById(Long id);
    void deletePostById(Long id);
}
