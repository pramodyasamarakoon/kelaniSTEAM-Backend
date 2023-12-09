package com.example.kelanisteam.controller;

import com.example.kelanisteam.model.Project;
import com.example.kelanisteam.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> allProjects = projectService.getAllProjects();
        return ResponseEntity.ok(allProjects);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable String id) {
        Project project = projectService.getProjectById(id);
        if (project != null) {
            return ResponseEntity.ok(project);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project createdProject = projectService.createProject(project);
        return ResponseEntity.ok(createdProject);
    }

//    @PutMapping("/update/{id}")
//    public ResponseEntity<Project> updateProject(@PathVariable String id, @RequestBody Project project) {
//        Project updatedProject = projectService.updateProject(id, project);
//        if (updatedProject != null) {
//            return ResponseEntity.ok(updatedProject);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteProject(@RequestParam String id) {
        projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
}
