package com.example.controller;

import com.example.entity.User;
import com.example.entity.UserProfile;
import com.example.service.UserService;
import com.example.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        if (user.getUserProfile() != null) {
            user.getUserProfile().setUser(user);
        }
        return userService.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PostMapping("/{userId}/profile")
    public User addUserProfile(@PathVariable Long userId, @RequestBody UserProfile userProfile) {
        User user = userService.findById(userId);
        if (user != null) {
            userProfile.setUser(user);
            user.setUserProfile(userProfile);
            userService.save(user);
            return user;
        }
        return null;
    }

    @DeleteMapping("/{userId}/profile")
    public User removeUserProfile(@PathVariable Long userId) {
        User user = userService.findById(userId);
        if (user != null && user.getUserProfile() != null) {
            userProfileService.deleteById(user.getUserProfile().getId());
            user.setUserProfile(null);
            return userService.save(user);
        }
        return null;
    }
}