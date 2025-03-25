package com.theater.Theater_Management_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theater.Theater_Management_System.model.User;
import com.theater.Theater_Management_System.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user); // Saves the user
    }

    public User validateUser(String username, String role) {
        // Validate user by querying repository
        return userRepository.findByUsernameAndRole(username, role);
    }
    

}
