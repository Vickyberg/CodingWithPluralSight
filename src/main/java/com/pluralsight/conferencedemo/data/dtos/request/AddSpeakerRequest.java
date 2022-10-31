package com.pluralsight.conferencedemo.data.dtos.request;

import com.pluralsight.conferencedemo.Gender;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddSpeakerRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private Gender gender;
    private  String country;
}
