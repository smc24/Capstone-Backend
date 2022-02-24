package com.keepitreal.keepitreal.controller;

import com.keepitreal.keepitreal.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class TherapistController {

    @Autowired
    private TherapistService therapistService;

    //checking connection with postman
    @GetMapping("/hello")
    public String getHelloWorld(){return "hello world";}
}
