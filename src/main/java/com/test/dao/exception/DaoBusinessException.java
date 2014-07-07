package com.test.dao.exception;

/**
 * Created by Matrix on 07.07.2014.
 */
public class DaoBusinessException extends DaoException {
    public DaoBusinessException(String message) {
        super(message);
    }

    public DaoBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
