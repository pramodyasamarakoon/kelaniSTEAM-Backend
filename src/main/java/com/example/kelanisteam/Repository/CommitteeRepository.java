package com.example.kelanisteam.repository;

import com.example.kelanisteam.model.Committee;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface CommitteeRepository extends MongoRepository<Committee, String> {
    // You can add custom query methods if needed
    List<Committee> findByIdStartingWith(String partialId);
}
