package com.pluralsight.conferencedemo.services.conferenceSevice;

import com.pluralsight.conferencedemo.data.models.Session;
import com.pluralsight.conferencedemo.data.repositories.SessionRepository;
import org.hibernate.SessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConferenceServiceImpl implements ConferenceService{

    @Autowired
    private SessionRepository sessionRepository;
    @Override
    public void createSession(Session session) {
        Optional<Session> optionalSession = sessionRepository.findById(session.getId());
        if(optionalSession.isPresent()){

            throw new SessionException("Session already exists");
        }
        else {
            sessionRepository.save(session);
        }
    }
}
