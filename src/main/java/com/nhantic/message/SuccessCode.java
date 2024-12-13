package com.nhantic.message;

public enum SuccessCode {
    CREATED("SUC201", "Resource created"),
    OK("SUC200", "OK"),
    NO_CONTENT("SUC204", "No Content");

    private final String code;
    private final String defaultMessage;

    SuccessCode(String code, String defaultMessage) {
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
