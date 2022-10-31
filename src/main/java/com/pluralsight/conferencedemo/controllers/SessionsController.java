package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.data.models.Session;
import com.pluralsight.conferencedemo.data.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list(){
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<Session> getSession(@PathVariable Long id){
        return sessionRepository.findById(id);
    }

//    @PostMapping
//    public Session createSession(@RequestBody  Session session){
//
//    }




}
