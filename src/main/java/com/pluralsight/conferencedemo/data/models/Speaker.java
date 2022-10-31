package com.pluralsight.conferencedemo.data.models;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstName;
    private  String lastName;
    private String email;
    private String title;
    private String company;
    private  String speakerBio;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speakerPhoto;

    @ManyToMany
    private List<Session> sessions;


}
