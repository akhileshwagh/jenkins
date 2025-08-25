package com.sunbeam.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.main.entity.Category;
import com.sunbeam.main.entity.Post;
import com.sunbeam.main.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
