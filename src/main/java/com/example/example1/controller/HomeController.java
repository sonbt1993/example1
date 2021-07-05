package com.example.example1.controller;


import com.example.example1.Repository.UserRepository;
import com.example.example1.entity.User;
import com.example.example1.service.IPostService;
import com.example.example1.service.PostService;
import com.example.example1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;

@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @Autowired private IPostService postService;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("posts", postService.getAllPost());
        return "index";
    }

    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        User personal = userService.findUserByUsername(principal.getName()).get();
        model.addAttribute("personal", personal);
        return "user";
    }

    @GetMapping("/user/{name}")
    public String userPage(@PathVariable("name") String name, Model model) {
        User personal = userService.findUserByUsername(name).get();
        model.addAttribute("personal", personal);
        return "user";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup")
    public String signUpPage() {
        return "signup";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/error")
    public String errorPage() {
        return "error";
    }



}
