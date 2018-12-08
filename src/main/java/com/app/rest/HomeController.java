package com.app.rest;

import com.app.response.ApiResponse;
import com.app.utils.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ResponseEntity<ApiResponse> getHome(){
        return Api.getSuccess("Hello Client ");
    }
}
