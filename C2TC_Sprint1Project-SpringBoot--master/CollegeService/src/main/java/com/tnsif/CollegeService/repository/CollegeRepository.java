package com.tnsif.CollegeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.CollegeService.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {
    // JPA already provides CRUD methods: findAll, findById, save, deleteById
}

