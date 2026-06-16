package com.ing.assessment.domain.command.handler;

public interface VoidCommandHandler<TCommand> {
    void handle(TCommand command);
}