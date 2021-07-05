package com.example.example1.DTO;

import com.example.example1.entity.Comment;
import com.example.example1.entity.Tag;
import com.example.example1.entity.User;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class PostDTO {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime lastUpdate;
    private List<Comment> comments = new ArrayList<>();
    private User author;
    private Set<Tag> tags = new HashSet<>();

}
