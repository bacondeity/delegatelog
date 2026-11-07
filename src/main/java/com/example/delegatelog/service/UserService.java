package com.example.delegatelog.service;

import com.example.delegatelog.db.UserRepository;
import com.example.delegatelog.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    private final UserRepository userRepository;
    List<User> users = new ArrayList<>();

    public void addUser(User u) {userRepository.save(u);}

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public UserService(UserRepository userRepository){ this.userRepository = userRepository;};
}
