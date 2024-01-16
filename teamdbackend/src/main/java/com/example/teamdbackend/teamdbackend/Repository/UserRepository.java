package com.example.teamdbackend.teamdbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.teamdbackend.teamdbackend.Entity.Users;

public interface UserRepository extends JpaRepository <Users, Long> {

}
