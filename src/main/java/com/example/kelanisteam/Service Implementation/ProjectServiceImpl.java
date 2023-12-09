package com.example.kelanisteam.service;

import com.example.kelanisteam.model.Project;
import com.example.kelanisteam.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Date;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        Pageable pageable = PageRequest.of(0, 8, Sort.by(Sort.Direction.DESC, "createdDate"));
        Page<Project> projectPage = projectRepository.findAll(pageable);
        return projectPage.getContent();
    }

    @Override
    public Project getProjectById(String id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public Project createProject(Project project) {
        // Set the current date as the creation date
        project.setCreatedDate(new Date());

        // Save the project to the database
        return projectRepository.save(project);
    }


//    @Override
//    public Project updateProject(String id, Project project) {
//        Project existingProject = projectRepository.findById(id).orElse(null);
//        if (existingProject != null) {
//            // Update fields as needed
//            existingProject.setProjectType(project.getProjectType());
//            existingProject.setProjectName(project.getProjectName());
//            existingProject.setProjectDescription(project.getProjectDescription());
//            existingProject.setCoverImageUrl(project.getCoverImageUrl());
//            existingProject.setPreviewImageUrls(project.getPreviewImageUrls());
//
//            return projectRepository.save(existingProject);
//        }
//        return null;
//    }

    @Override
    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }
}
