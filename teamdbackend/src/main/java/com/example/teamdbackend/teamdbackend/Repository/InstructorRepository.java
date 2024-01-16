package com.example.teamdbackend.teamdbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.teamdbackend.teamdbackend.Entity.Instructor;

public interface InstructorRepository extends JpaRepository <Instructor, Long>{

}
