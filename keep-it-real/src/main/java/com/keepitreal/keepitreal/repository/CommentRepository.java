package com.keepitreal.keepitreal.repository;

import com.keepitreal.keepitreal.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
