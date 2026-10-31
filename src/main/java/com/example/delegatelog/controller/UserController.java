package com.example.delegatelog.controller;
import com.example.delegatelog.service.UserService;
import org.springframework.stereotype.Controller;
import com.example.delegatelog.model.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.RequestAttributes;

import java.util.List;

@Controller

public class UserController {

    private final UserService service;

    public UserController(UserService service) { this.service = service;}

    @GetMapping("/user/add")
    public String displayUserForm(Model model){
        System.out.println("Check");
        model.addAttribute("user", new User());
        return "userform";
    }

    @PostMapping("/user/add")
    public String processUserForm(@ModelAttribute("user") User user){
        System.out.println("[Inside Process]");
        service.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String displayUsers(Model model){
        List<User> users = service.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
}
