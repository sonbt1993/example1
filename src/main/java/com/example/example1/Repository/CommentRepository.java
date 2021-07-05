package com.example.example1.Repository;

import com.example.example1.entity.Comment;
import com.example.example1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findCommentsByPost(Post post);
    Comment findCommentById(Long id);
}
