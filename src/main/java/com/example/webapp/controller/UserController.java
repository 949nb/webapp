package com.example.webapp.controller;
import com.example.webapp.model.User;
import com.example.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/login")
    public String[] login(@RequestBody User loginUser) {
        boolean isValid = userService.checkLogin(loginUser.getUsername(), loginUser.getPassword());
        if (isValid) {
            return new String[]{"Login successful", "0"};
        } else {
            return new String[]{"Login failed", "1"};
        }
    }

    @PostMapping("/api/register")
    public String[] register(@RequestBody User user) {
        boolean success = userService.registerUser(user);
        if (success) {
            return new String[]{"User registered successfully", "0"};
        } else {
            return new String[]{"Username or email already exists", "1"};
        }
    }



}
