package com.example.example1.controller;

import com.example.example1.entity.Post;
import com.example.example1.service.ICommentService;
import com.example.example1.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PostController {
    @Autowired private IPostService postService;

    @Autowired private ICommentService commentService;

    @GetMapping("/post")
    public String post() {
        return "post";
    }

    @GetMapping("/post/add")
    public String addPost( Model model) {
        model.addAttribute("post", new Post());
        return "addPost";
    }

    @PostMapping("/post/add")
    public String savePost(@ModelAttribute(name = "post") Post post){

//        post.setAuthor();
        postService.addPostIntoUser(post);
        return "redirect:/index";
    }
}
