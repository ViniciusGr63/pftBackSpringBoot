package com.example.ptfBackEnd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/msg")
    public String mostrarPagina() {
        return "Pagina";  // Nome do arquivo HTML sem a extensão ".html"
    }
}
