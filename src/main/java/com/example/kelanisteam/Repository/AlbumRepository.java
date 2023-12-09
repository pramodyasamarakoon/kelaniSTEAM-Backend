package com.example.kelanisteam.repository;

import com.example.kelanisteam.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String> {

    // You can add custom queries here if needed

//    Album findByEmail(String email);
}
