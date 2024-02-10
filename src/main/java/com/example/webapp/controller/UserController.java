package com.example.webapp.controller;
import com.example.webapp.model.User;
import com.example.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User loginUser) {
        boolean isValid = userService.checkLogin(loginUser.getUsername(), loginUser.getPassword());
        if (isValid) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        boolean success = userService.registerUser(user);
        if (success) {
            return "User registered successfully";
        } else {
            return "Username or email already exists";
        }
    }
}
