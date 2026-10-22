package com.example.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String welcome(){
        return "<h1 style='color:red'>Welcome to SpringBoot Application <h1/>";
    }

    @GetMapping("/add")
    public int sum(int a, int b){
        return 0;
    }
}
