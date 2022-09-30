package com.sks.spring.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sks.spring.validation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

}
