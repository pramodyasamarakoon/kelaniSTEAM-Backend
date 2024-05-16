// UserRepository.java
package com.example.kelanisteam.repository;

import com.example.kelanisteam.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsernameAndPassword(String username, String password);
}
