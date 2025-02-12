package com.example.sping_k8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {
    @GetMapping("/getUsers")
    public List<String> getUsers(){
        return List.of("Kashish","Shruti","Monu");
    }
}
