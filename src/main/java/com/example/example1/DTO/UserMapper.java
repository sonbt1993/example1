package com.example.example1.DTO;

import com.example.example1.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO userToUserDTO(User user);
}
