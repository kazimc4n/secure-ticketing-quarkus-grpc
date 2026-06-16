package com.ing.assessment.domain.common.exception;

public class AccessDeniedException extends RuntimeException {

    public AccessDeniedException(Long userId) {
        super("Access denied for user with ID: " + userId);
    }
}