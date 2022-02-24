package com.keepitreal.keepitreal.service;

import com.keepitreal.keepitreal.model.Therapist;
import com.keepitreal.keepitreal.repository.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TherapistService {

    @Autowired
    private TherapistRepository therapistRepository;

    //GETTING THE LIST OF THERAPISTS
    public List<Therapist> getAllTherapists(){
        List<Therapist> therapist = therapistRepository.findAll();
        if(therapist==null){
            
        }
    }





}
