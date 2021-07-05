package com.example.example1.service;

import com.example.example1.Repository.UserRepository;
import com.example.example1.entity.Role;
import com.example.example1.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

@Service("userDetailServiceImpl")
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private final UserService userService;
    @Override
    public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
        Optional<User> user = userService.findUserByUsername(Username);
        if (user == null) {
            System.out.println("User not found!" + Username);
            throw new UsernameNotFoundException("User " + Username + " was not found in the database");
        }
        System.out.println("Found user!" + Username);
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.get().getUsername(), user.get().getPassword(), getRole(user));
        System.out.println(userDetails);
        return userDetails;
    }

    public Set<SimpleGrantedAuthority> getRole(Optional<User> user) {
        Role role = user.get().getRole();
        return Collections.singleton(new SimpleGrantedAuthority(role.getName()));
    }
}
