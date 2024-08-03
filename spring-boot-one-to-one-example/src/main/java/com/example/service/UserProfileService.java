package com.example.service;

import com.example.entity.UserProfile;
import com.example.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {
    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserProfile save(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public List<UserProfile> findAll() {
        return userProfileRepository.findAll();
    }

    public UserProfile findById(Long id) {
        return userProfileRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userProfileRepository.deleteById(id);
    }
}