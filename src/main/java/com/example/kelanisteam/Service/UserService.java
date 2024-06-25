// UserService.java
package com.example.kelanisteam.service;

import com.example.kelanisteam.model.User;
import com.example.kelanisteam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public String authenticateUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            // Generate and return a 48-digit long string as authentication token
            return generateAuthToken();
        }
        return null;
    }

    private String generateAuthToken() {
        // Generate a random UUID and return its string representation
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
