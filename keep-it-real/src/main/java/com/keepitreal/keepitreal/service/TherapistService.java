package com.keepitreal.keepitreal.service;

import com.keepitreal.keepitreal.repository.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TherapistService {

    @Autowired
    private TherapistRepository therapistRepository;
}
