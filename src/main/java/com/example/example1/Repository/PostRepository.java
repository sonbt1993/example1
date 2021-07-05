package com.example.example1.Repository;

import com.example.example1.entity.Post;
import com.example.example1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostById(Long id);
    List<Post> findByAuthor(User user);
}
