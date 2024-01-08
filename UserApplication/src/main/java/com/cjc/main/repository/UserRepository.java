package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{


public User findByEmail(String email);

}
