package com.ing.assessment.domain.common.handler;

public interface CommandHandler<TCommand, TResponse> {
    TResponse handle(TCommand command);
}