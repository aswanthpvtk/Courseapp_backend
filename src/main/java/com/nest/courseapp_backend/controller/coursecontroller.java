package com.nest.courseapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class coursecontroller {

    @PostMapping("/")
    public String Home()
    {
        return "home page";
    }
}
