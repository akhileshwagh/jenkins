package com.sunbeam.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.main.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
