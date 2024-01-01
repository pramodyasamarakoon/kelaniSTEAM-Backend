package com.example.kelanisteam.service;

import com.example.kelanisteam.model.Committee;
import com.example.kelanisteam.repository.CommitteeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommitteeService {

    private final CommitteeRepository committeeRepository;

    @Autowired
    public CommitteeService(CommitteeRepository committeeRepository) {
        this.committeeRepository = committeeRepository;
    }

    public List<Committee> getAllCommittees() {
        return committeeRepository.findAll();
    }

    public Optional<Committee> getCommitteeById(String id) {
        return committeeRepository.findById(id);
    }

    public Committee saveCommittee(Committee committee) {
        return committeeRepository.save(committee);
    }

    public void deleteCommittee(String id) {
        committeeRepository.deleteById(id);
    }

    public List<Committee> getCommitteesByPartialId(String partialId) {
        return committeeRepository.findByIdStartingWith(partialId);
    }
}
