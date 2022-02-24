package com.keepitreal.keepitreal.service;

import com.keepitreal.keepitreal.exceptions.InformationExistsException;
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

    //CREATING A POST
    public Posts createPosts(Posts postsObject){
        Posts posts = postsRepository.findByName(postsObject.getName());
        if(posts!=null){
            throw new InformationExistsException("post from "+postsObject.getName()+" already exists.");
        } else{
            return postsRepository.save(postsObject);
        }
    }

    //GETTING A CERTAIN POST
    public Posts getOnePost(Long postsId){
        Posts post = postsRepository.findById(postsId).get();
        if(post==null){
            throw new InformationNotFoundException("post with ID "+postsId+" does not exist.");
        } else{
            return post;
        }
    }

    //UPDATING A POST
    public Posts updatePost(Long postsId, Posts postObject){
        Posts post = postsRepository.findById(postsId).get();
        if(post!=null){
            Posts updatePost = postsRepository.findById(postsId).get();
            updatePost.setName(postObject.getName());
            updatePost.setMentalConcern(postObject.getMentalConcern());
            return postsRepository.save(updatePost);
        } else{
            throw new InformationNotFoundException("post with ID "+postsId+" does not exist.");
        }
    }

    //DELETE A POST
    public String deletePost(Long postsId){
        Posts post = postsRepository.findById(postsId).get();
        if(post==null){
            throw new InformationNotFoundException("post with ID "+postsId+" does not exist.");
        } else{
            postsRepository.deleteById(postsId);
            return "post "+postsId+" has been deleted.";
        }
    }



}
