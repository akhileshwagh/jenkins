package com.sunbeam.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.main.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
