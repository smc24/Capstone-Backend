package com.keepitreal.keepitreal.controller;

import com.keepitreal.keepitreal.model.Posts;
import com.keepitreal.keepitreal.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/anonuser")
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/posts/")
    public List<Posts> getAllPosts(){ return postsService.getAllPosts();}

    @PostMapping("/posts/")
    public Posts createPosts(@RequestBody Posts postsObject){
        return postsService.createPosts(postsObject);
    }

    @GetMapping("/posts/{postsId}/")
    public Posts getOnePost(@PathVariable Long postsId){
        return postsService.getOnePost(postsId);
    }



}
