package com.pluralsight.conferencedemo.services.speakerService;

import com.pluralsight.conferencedemo.data.dtos.request.AddSpeakerRequest;
import com.pluralsight.conferencedemo.data.dtos.response.AddSpeakerResponse;
import com.pluralsight.conferencedemo.exception.SpeakerAlreadyExistsException;


public interface SpeakerService {
    AddSpeakerResponse addSpeaker(AddSpeakerRequest request) throws SpeakerAlreadyExistsException;
}
