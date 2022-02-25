package com.keepitreal.keepitreal.controller;

import com.keepitreal.keepitreal.model.Comment;
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

    @PutMapping("/posts/{postsId}/")
    public Posts updatePost(@PathVariable Long postsId, @RequestBody Posts postObject){
        return postsService.updatePost(postsId, postObject);
    }

    @DeleteMapping("/posts/{postsId}/")
    public String deletePost(@PathVariable Long postsId){
        return postsService.deletePost(postsId);
    }

/////////////////////////////COMMENTS/////////////////////////////////////

    @GetMapping("/posts/{postsId}/comment/")
    public List<Comment> getAllComments(@PathVariable Long postsId){
        return postsService.getAllComments(postsId);
    }

    @PostMapping("/posts/{postsId}/comment/")
    public Comment createComment(@PathVariable Long postsId, @RequestBody Comment commentObject){
        return postsService.createComment(postsId, commentObject);
    }

    @DeleteMapping("/posts/{postsId}/comment/{commentId}/")
    public String deleteComment(@PathVariable Long postsId, @PathVariable Long commentId){
        return postsService.deleteComment(postsId, commentId);
    }

}
