package com.keepitreal.keepitreal.service;

import com.keepitreal.keepitreal.exceptions.InformationExistsException;
import com.keepitreal.keepitreal.exceptions.InformationNotFoundException;
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
        List<Therapist> therapists = therapistRepository.findAll();
        if(therapists==null){
            throw new InformationNotFoundException("no therapists available.");
        } else {
            return therapists;
        }
    }

    //CREATING A THERAPIST
    public Therapist createTherapist(Therapist therapistObject){
        Therapist therapist = therapistRepository.findByName(therapistObject.getName());
        if(therapist!=null){
            throw new InformationExistsException(therapistObject.getName()+" already exists in the system.");
        } else {
            return therapistRepository.save(therapistObject);
        }

    }





}
