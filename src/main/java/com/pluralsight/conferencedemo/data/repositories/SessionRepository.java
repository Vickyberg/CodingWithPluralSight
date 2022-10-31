package com.pluralsight.conferencedemo.data.repositories;


import com.pluralsight.conferencedemo.data.models.Session;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SessionRepository extends MongoRepository<Session, Long> {
}