package com.example.kelanisteam.service;

import com.example.kelanisteam.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();

    Project getProjectById(String id);

    Project createProject(Project project);

//    Project updateProject(String id, Project project);

    void deleteProject(String id);
}
