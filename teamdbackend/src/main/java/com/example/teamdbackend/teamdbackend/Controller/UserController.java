package com.example.teamdbackend.teamdbackend.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.teamdbackend.teamdbackend.Entity.Users;
import com.example.teamdbackend.teamdbackend.Service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{UserID}")
    public Users getUsersbyId(@PathVariable Long UserID) {
        return userService.getUsersById(UserID);
    }

    @PostMapping
    public Users saveUsers(@RequestBody Users users) {
        return userService.savUsers(users);
    }

    @DeleteMapping
    public void deleteUsers(@PathVariable Long UserID) {
        userService.deleteUsers(UserID);
    }
}
