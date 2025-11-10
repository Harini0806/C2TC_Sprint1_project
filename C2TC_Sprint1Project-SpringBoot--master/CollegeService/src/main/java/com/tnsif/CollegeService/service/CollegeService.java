package com.tnsif.CollegeService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CollegeService.entity.College;
import com.tnsif.CollegeService.repository.CollegeRepository;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository repo;

    // 1. List all colleges
    public List<College> listAll() {
        return repo.findAll();
    }

    // 2. Get a single college by ID
    public College getById(int id) {
        Optional<College> college = repo.findById(id);
        return college.orElse(null);
    }

    // 3. Add new college
    public College addCollege(College college) {
        return repo.save(college);
    }

    // 4. Update college details
    public College updateCollege(College college) {
        return repo.save(college);
    }

    // 5. Delete college
    public void deleteCollege(int id) {
        repo.deleteById(id);
    }
}

