package com.example.kelanisteam.repository;

import com.example.kelanisteam.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
    // You can add custom query methods if needed
//    Booking findById(String id);
}
