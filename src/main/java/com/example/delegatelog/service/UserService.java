package com.example.delegatelog.service;

import com.example.delegatelog.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    List<User> users = new ArrayList<>();

    public void addUser(User u) {users.add(u);}

    public List<User> getAllUsers(){
        return users;
    }

    public UserService(){};
}
