package com.example.ptfBackEnd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/info")
public class InfoController {

    private final RestTemplate restTemplate;

    public InfoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String getInfo() {
        String url = "https://api.kanye.rest/"; 
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response.getBody();
    }
    
    
}
