package com.example.teamdbackend.teamdbackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teamdbackend.teamdbackend.Entity.Instructor;
import com.example.teamdbackend.teamdbackend.Service.InstructorService;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @GetMapping 
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructor();
    }

    @GetMapping("/{InstructorID}")
    public Instructor getInstructorById(@PathVariable Long InstructorID) {
        return instructorService.getInstructorById(InstructorID);
    }
    
    @PostMapping
    public Instructor saveInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @DeleteMapping("/{InstructorID}")
    public void deleteInstructor(@PathVariable Long InstructorID) {
        instructorService.deleteInstructor(InstructorID);
    }
}
