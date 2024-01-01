package com.example.kelanisteam.controller;

import com.example.kelanisteam.model.Committee;
import com.example.kelanisteam.service.CommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/committee")
@CrossOrigin(origins = "http://localhost:3000")
public class CommitteeController {

    private final CommitteeService committeeService;

    @Autowired
    public CommitteeController(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    @GetMapping("/getAll")
    public List<Committee> getAllCommittees() {
        return committeeService.getAllCommittees();
    }

    @GetMapping("/getById")
    public ResponseEntity<Committee> getCommitteeById(@RequestParam String id) {
        return committeeService.getCommitteeById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("addCommittee")
    public ResponseEntity<Committee> createCommittee(@RequestBody Committee committee) {
        Committee savedCommittee = committeeService.saveCommittee(committee);
        return new ResponseEntity<>(savedCommittee, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<Void> deleteCommittee(@RequestParam String id) {
        committeeService.deleteCommittee(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/updateCommittee/{id}")
    public ResponseEntity<Committee> updateCommittee(@PathVariable String id, @RequestBody Committee updatedCommittee) {
        return committeeService.getCommitteeById(id)
                .map(existingCommittee -> {
                    existingCommittee.setClub(updatedCommittee.getClub());
                    existingCommittee.setName(updatedCommittee.getName());
                    existingCommittee.setPosition(updatedCommittee.getPosition());
                    existingCommittee.setImageUrl(updatedCommittee.getImageUrl());

                    // Update other properties as needed

                    Committee updated = committeeService.saveCommittee(existingCommittee);
                    return ResponseEntity.ok(updated);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/getByPartialId")
    public List<Committee> getCommitteesByPartialId(@RequestParam String partialId) {
        return committeeService.getCommitteesByPartialId(partialId);
    }
}
