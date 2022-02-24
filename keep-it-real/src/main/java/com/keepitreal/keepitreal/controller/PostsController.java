package com.keepitreal.keepitreal.controller;

import com.keepitreal.keepitreal.model.Posts;
import com.keepitreal.keepitreal.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/anonuser")
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/posts/")
    public List<Posts> getAllPosts(){ return postsService.getAllPosts();}



}
