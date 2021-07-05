package com.example.example1.DTO;

import com.example.example1.entity.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    PostDTO postToPostDTO(Post post);
}
