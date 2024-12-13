package com.nhantic.exception;

public class ResourceExceptionFactory {
    /**
     * Init ResourceException with error code and message code
     *
     * @param errorCode
     * @param errorMessage
     * @return ResourceException
     */
    public static ResourceException initResourceException(String errorCode, String errorMessage) {
        return new ResourceException(errorCode, errorMessage);
    }
}
