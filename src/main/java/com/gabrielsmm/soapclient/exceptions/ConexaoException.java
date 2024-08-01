package com.gabrielsmm.soapclient.exceptions;

public class ConexaoException extends RuntimeException {

    public ConexaoException(String message) {
        super(message);
    }

    public ConexaoException(String message, Throwable cause) {
        super(message, cause);
    }

}
