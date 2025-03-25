package com.theater.Theater_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theater.Theater_Management_System.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsernameAndRole(String username, String role);

}
