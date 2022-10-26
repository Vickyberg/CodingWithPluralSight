package com.pluralsight.conferencedemo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "sessions")
@Getter
@Setter
public class Session {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sessionName;
    private String description;
    private Integer sessionLength;

    public Session() {
    }
}
