package com.example.springboottutorial;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public void addSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(UUID id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Software engineer not found: " + id));
    }
}
