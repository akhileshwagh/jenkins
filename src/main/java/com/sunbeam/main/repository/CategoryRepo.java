package com.sunbeam.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.main.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
