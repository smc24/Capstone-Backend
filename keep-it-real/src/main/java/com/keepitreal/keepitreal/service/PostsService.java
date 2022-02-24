package com.keepitreal.keepitreal.service;

import com.keepitreal.keepitreal.exceptions.InformationNotFoundException;
import com.keepitreal.keepitreal.model.Posts;
import com.keepitreal.keepitreal.model.Therapist;
import com.keepitreal.keepitreal.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    //GETTING ALL POSTS
    public List<Posts> getAllPosts(){
        List<Posts> posts = postsRepository.findAll();
        if(posts==null){
            throw new InformationNotFoundException("no posts available.");
        } else {
            return posts;
        }
    }



}
