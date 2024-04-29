package com.telusko.springsecdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.springsecdemo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
}
