package com.test.dao.exception;

/**
 * Created by Matrix on 07.07.2014.
 */
public class DaoSystemException extends DaoException {
    public DaoSystemException(String message) {
        super(message);
    }

    public DaoSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
