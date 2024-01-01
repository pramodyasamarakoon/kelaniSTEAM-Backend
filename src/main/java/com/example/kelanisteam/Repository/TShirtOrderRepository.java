package com.example.kelanisteam.repository;

import com.example.kelanisteam.model.TShirtOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TShirtOrderRepository extends MongoRepository<TShirtOrder, String> {

    // You can add custom query methods if needed
    List<TShirtOrder> findAll();
}
