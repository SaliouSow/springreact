package com.project.fullstackback.controller;

import com.project.fullstackback.model.User;
import com.project.fullstackback.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UserController {
    private UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    List<User> getUsers() {
        return userRepository.findAll();
    }
}
