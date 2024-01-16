package com.example.teamdbackend.teamdbackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teamdbackend.teamdbackend.Entity.Instructor;
import com.example.teamdbackend.teamdbackend.Repository.InstructorRepository;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAll();
    }

    public Instructor getInstructorById(Long InstructorID) {
        return instructorRepository.findById(InstructorID).orElse(null);
    }

    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void deleteInstructor(Long InstructorID) {
        instructorRepository.deleteById(InstructorID);
    }
}
