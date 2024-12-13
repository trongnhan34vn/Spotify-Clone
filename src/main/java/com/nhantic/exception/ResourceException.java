package com.nhantic.exception;

public class ResourceException extends RuntimeException {
    private final String errorCode;

    public ResourceException(String errorCode) {
        this.errorCode = errorCode;
    }

    public ResourceException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ResourceException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ResourceException(String errorCode, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public ResourceException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }
    
    public String getErrorCode() {
        return this.errorCode;
    }
}
