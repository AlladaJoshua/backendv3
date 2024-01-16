package com.example.teamdbackend.teamdbackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teamdbackend.teamdbackend.Entity.Users;
import com.example.teamdbackend.teamdbackend.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;

    public List<Users> getAllUsers() {
        return UserRepository.findAll();
    }

    public Users getUsersById(Long UserID) {
        return UserRepository.findById(UserID).orElse(null);
    }

    public Users savUsers(Users users) {
        return UserRepository.save(users);
    }

    public void deleteUsers(Long UserID) {
        UserRepository.deleteById(UserID);
    }
}
