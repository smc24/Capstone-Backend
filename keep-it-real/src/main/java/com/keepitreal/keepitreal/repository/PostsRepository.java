package com.keepitreal.keepitreal.repository;

import com.keepitreal.keepitreal.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    Posts findByName(String postsName);
}
