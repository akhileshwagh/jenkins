package com.sunbeam.main.service;

import java.util.List;

import com.sunbeam.main.payload.CategoryDto;


public interface CategoryService {

	// create
	public CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	void deleteCategory(Integer categoryId);

	// get
	CategoryDto getCategory(Integer categoryId);
	
	// get all
	List<CategoryDto> getCategories();
}
