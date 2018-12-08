package com.app.enu;

import org.springframework.http.HttpStatus;

public enum  ApiErrorCode {
   SUCCESS(HttpStatus.OK,"200000","Success") ;

    public HttpStatus getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ApiErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    private HttpStatus status;
    private String code;
    private String message;
}
