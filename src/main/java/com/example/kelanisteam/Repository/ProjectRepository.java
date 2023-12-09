package com.example.kelanisteam.repository;

import com.example.kelanisteam.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
