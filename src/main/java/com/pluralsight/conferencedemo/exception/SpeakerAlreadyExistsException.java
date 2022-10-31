package com.pluralsight.conferencedemo.exception;

public class SpeakerAlreadyExistsException extends Exception {
    public SpeakerAlreadyExistsException(String message) {
        super(message);
    }
}
