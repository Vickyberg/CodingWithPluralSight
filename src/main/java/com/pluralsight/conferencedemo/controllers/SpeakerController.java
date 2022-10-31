package com.pluralsight.conferencedemo.controllers;


import com.pluralsight.conferencedemo.data.models.Speaker;
import com.pluralsight.conferencedemo.data.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/speakers")
public class SpeakerController {

    @Autowired
    private SpeakerRepository speakerRepository;

    public List<Speaker> listOfSpeaker(){
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<Speaker> getSpeakerById(@PathVariable Long id){
        return speakerRepository.findById(id);
    }
}
