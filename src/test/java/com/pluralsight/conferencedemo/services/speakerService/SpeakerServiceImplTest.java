package com.pluralsight.conferencedemo.services.speakerService;

import com.pluralsight.conferencedemo.Gender;
import com.pluralsight.conferencedemo.data.dtos.request.AddSpeakerRequest;
import com.pluralsight.conferencedemo.data.dtos.response.AddSpeakerResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpeakerServiceImplTest {

    @Autowired
    private SpeakerService speakerService;
    private  AddSpeakerRequest request;

    @BeforeEach
    void setUp() {

        request = AddSpeakerRequest.builder()
                .email("imran@gmail.com")
                .country("Nigeria")
                .gender(Gender.MALE)
                .build();
    }

    @Test
    void addSpeakerTest() {
        AddSpeakerResponse response =speakerService.addSpeaker(request);
        assertThat(response).isNotNull();
        assertThat(response.getName()).isNotNull();
        assertThat(response.getMessage()).isNotNull();
        assertThat(response.getId()).isGreaterThan(0);

    }
}