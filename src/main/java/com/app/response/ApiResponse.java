package com.app.response;

import java.io.Serializable;

public class ApiResponse  implements Serializable {
    private String requestId;
    private String code;
    private String message;
    private Object data;

    public ApiResponse(String code, String message, Object data) {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ApiResponse(String requestId, String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
