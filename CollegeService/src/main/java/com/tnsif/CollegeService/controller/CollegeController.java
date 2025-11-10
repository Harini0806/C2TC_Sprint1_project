package com.tnsif.CollegeService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.CollegeService.entity.College;
import com.tnsif.CollegeService.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService service;

    // Get all colleges
    @GetMapping("/getAll")
    public List<College> getAllColleges() {
        return service.listAll();
    }

    // Get college by ID
    @GetMapping("/{id}")
    public College getCollege(@PathVariable int id) {
        return service.getById(id);
    }

    // Add college
    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return service.addCollege(college);
    }

    // Update college
    @PutMapping("/update")
    public College updateCollege(@RequestBody College college) {
        return service.updateCollege(college);
    }

    // Delete college
    @DeleteMapping("/delete/{id}")
    public String deleteCollege(@PathVariable int id) {
        service.deleteCollege(id);
        return "College deleted successfully with ID: " + id;
    }
}

