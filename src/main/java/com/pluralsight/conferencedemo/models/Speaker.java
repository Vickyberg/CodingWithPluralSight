package com.pluralsight.conferencedemo.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "speaker")
@Getter
@Setter
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstName;
    private  String lastName;
    private String title;
    private String company;
    private  String speakerBio;

    public Speaker(){

    }

}
