package com.pluralsight.conferencedemo.data.repositories;

import com.pluralsight.conferencedemo.data.models.Speaker;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface SpeakerRepository extends MongoRepository<Speaker, Long> {

    Optional<Speaker> findByEmail(String email);
}
