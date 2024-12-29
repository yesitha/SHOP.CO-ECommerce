package com.shopco.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValueAlreadyExistsException extends ApplicationException {
    private static final long serialVersionUID = 1L;

    public ValueAlreadyExistsException() {
        super();
    }

    public ValueAlreadyExistsException(String message) {
        super(message);
    }

    public ValueAlreadyExistsException(String message, Throwable e) {
        super(message, e);
    }
}