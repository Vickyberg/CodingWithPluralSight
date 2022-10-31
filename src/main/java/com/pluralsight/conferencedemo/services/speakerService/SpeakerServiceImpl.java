package com.pluralsight.conferencedemo.services.speakerService;

import com.pluralsight.conferencedemo.data.dtos.request.AddSpeakerRequest;
import com.pluralsight.conferencedemo.data.dtos.response.AddSpeakerResponse;
import com.pluralsight.conferencedemo.data.models.Session;
import com.pluralsight.conferencedemo.data.models.Speaker;
import com.pluralsight.conferencedemo.data.repositories.SpeakerRepository;
import com.pluralsight.conferencedemo.exception.SpeakerAlreadyExistsException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SpeakerServiceImpl implements SpeakerService {


    private final SpeakerRepository speakerRepository;
    private final ModelMapper mapper =new ModelMapper();


    @Override
    public AddSpeakerResponse addSpeaker(AddSpeakerRequest addSpeakerRequest) throws SpeakerAlreadyExistsException {
        Optional<Speaker> foundSpeaker  =speakerRepository.findByEmail(addSpeakerRequest.getEmail());
        if (foundSpeaker.isPresent()){
        throw new SpeakerAlreadyExistsException(String.format("Speaker with email %s already exist",addSpeakerRequest.getEmail()));
        }

        Speaker speaker =mapper.map(addSpeakerRequest, Speaker.class);

        return null;
    }
}
