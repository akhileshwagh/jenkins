package com.sunbeam.main.payload;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sunbeam.main.entity.Category;
import com.sunbeam.main.entity.Comment;
import com.sunbeam.main.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	
	
	private int postId;
	
	private String title;

	private String content;

	private String imageName;
	
	private Date addeddate;
	
	private CategoryDto category;
	
	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();

	public void setImageName(String fileName) {
		// TODO Auto-generated method stub
		
	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public Set<CommentDto> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}

	public String getImageName() {
		return imageName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
