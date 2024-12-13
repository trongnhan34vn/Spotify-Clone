package com.nhantic.message;

public enum ErrorCode {
    NOT_FOUND("ERR404", "Resource not found"),
    INTERNAL_SERVER_ERROR("ERR500", "Internal Server Error"),
    BAD_REQUEST("ERR400", "Bad Request"),
    CONFLICT("ERR409", "Conflict"),
    UNAUTHORIZED("ERR401", "Unauthorized"),
    FORBIDDEN("ERR403", "Forbidden"),;

    private final String code;
    private final String defaultMessage;

    ErrorCode(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public String getCode() {
        return code;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}
