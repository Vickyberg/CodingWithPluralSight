package com.pluralsight.conferencedemo.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sessionName;
    private String description;
    private Integer sessionLength;


    @ManyToMany
    @JoinTable(
            name = "session_speakers",
            joinColumns = @JoinColumn(name ="session_Id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    private List< Speaker> speakers = new ArrayList<>();
}
