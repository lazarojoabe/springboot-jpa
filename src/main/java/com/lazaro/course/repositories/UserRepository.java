package com.lazaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
