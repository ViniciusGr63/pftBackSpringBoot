package com.example.ptfBackEnd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    
    private final String msg = "Ti amu";
    
    @GetMapping("/msg")
    @ResponseBody 
    public String mostrarPagina() {
        return msg;  
    }
}
