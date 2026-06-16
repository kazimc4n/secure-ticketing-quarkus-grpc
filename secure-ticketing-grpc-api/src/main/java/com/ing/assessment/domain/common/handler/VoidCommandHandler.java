package com.ing.assessment.domain.common.handler;

public interface CommandHandler<T> {
    void handle(T command);
}