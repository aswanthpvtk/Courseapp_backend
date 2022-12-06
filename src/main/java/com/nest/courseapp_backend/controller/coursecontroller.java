package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class coursecontroller {

    @PostMapping("/")
    public String Home()
    {
        return "home page";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Course s)
    {
        System.out.println(s.getTitle().toString());
        return "adding the book";
    }
}
