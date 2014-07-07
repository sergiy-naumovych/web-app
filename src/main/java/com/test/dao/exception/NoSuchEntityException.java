package com.test.dao.exception;

/**
 * Created by Matrix on 07.07.2014.
 */
public class NoSuchEntityException extends DaoBusinessException {


    public NoSuchEntityException(String message) {
        super(message);
    }

    public NoSuchEntityException(String message, Throwable cause) {
        super(message, cause);
    }
}
