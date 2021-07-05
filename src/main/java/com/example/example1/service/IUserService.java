package com.example.example1.service;

import com.example.example1.entity.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findUserByUsername(String username);
}
