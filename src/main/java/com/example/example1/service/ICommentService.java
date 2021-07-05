package com.example.example1.service;

import com.example.example1.entity.Comment;
import com.example.example1.entity.Post;

import java.util.List;

public interface ICommentService {
    List<Comment> getALlCommentOfPost(Post post);
    Comment getCommentById(Long id);
    Comment save(Comment comment);
    void removeComment(Comment comment);
}
