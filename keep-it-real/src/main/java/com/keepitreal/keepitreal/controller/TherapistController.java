package com.keepitreal.keepitreal.controller;

import com.keepitreal.keepitreal.model.Comment;
import com.keepitreal.keepitreal.model.Therapist;
import com.keepitreal.keepitreal.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/api")
public class TherapistController {

    @Autowired
    private TherapistService therapistService;

    //checking connection with postman
    @GetMapping("/hello")
    public String getHelloWorld(){return "hello world";}

    @GetMapping("/therapists/")
    public List<Therapist> getAllTherapists(){return therapistService.getAllTherapists();}

    @PostMapping("/therapists/")
    public Therapist createTherapist(@RequestBody Therapist therapistObject){
        return therapistService.createTherapist(therapistObject);
    }

    @GetMapping("/therapists/{therapistId}/")
    public Optional<Therapist> getOneTherapist(@PathVariable Long therapistId){
        return therapistService.getOneTherapist(therapistId);
    }

    @PutMapping("/therapists/{therapistId}/")
    public Therapist updateTherapist(@PathVariable Long therapistId, @RequestBody Therapist therapistObject){
        return therapistService.updateTherapist(therapistId, therapistObject);
    }

    @DeleteMapping("/therapists/{therapistId}/")
    public String deleteTherapist(@PathVariable Long therapistId){
        return therapistService.deleteTherapist(therapistId);
    }


}

