package com.app.rest;

import com.app.response.ApiResponse;
import com.app.utils.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Value("${evn.name}")
    private String envName ;
    @GetMapping
    public ResponseEntity<ApiResponse> getHome(){
        return Api.getSuccess("Hello Client. Server Api started with " + envName);
    }
}
