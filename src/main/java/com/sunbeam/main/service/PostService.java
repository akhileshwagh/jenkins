package com.sunbeam.main.service;

import java.util.List;

import com.sunbeam.main.entity.Post;
import com.sunbeam.main.payload.PostDto;
import com.sunbeam.main.payload.PostResponse;

public interface PostService {

	// create post
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

	// update post
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete post
	void deletePost(Integer postId);

	// get single post
	PostDto getPostById(Integer postId);

	// get all post
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);

	// get all posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// get all posts by user
	List<PostDto> getPostsByUser(Integer userId);

	//search post
	List<PostDto> searchPosts(String Keyword);

}
