package com.example.servicemocking.controller;

import com.example.servicemocking.service.UserService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<String> getUser() {

        String result = userService.getUser();

        return ResponseEntity.ok(result);
    }
}