package com.ing.assessment.domain.common.exception;

public class EventAlreadyStartedException extends RuntimeException {

    public EventAlreadyStartedException(Long eventId) {
        super("Event already started with ID: " + eventId);
    }
}