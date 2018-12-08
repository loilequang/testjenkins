package com.app.utils;

import com.app.enu.ApiErrorCode;
import com.app.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Api {
    public static ResponseEntity<ApiResponse> getResponse(HttpStatus status, String code, String message, Object data ){
        ApiResponse apiResponse = new ApiResponse(code,message,        data);
        return new ResponseEntity<>(apiResponse, status        );

    }
    public  static  ResponseEntity<ApiResponse> getSuccess(Object data){
        ApiErrorCode success = ApiErrorCode.SUCCESS;
                return getResponse(success.getStatus(),success.getCode(), success.getMessage(), data);
    }
}
