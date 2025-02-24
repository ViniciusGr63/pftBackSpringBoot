package com.example.ptfBackEnd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/pagina")
    public String mostrarPagina() {
        return "pagina";  // Nome do seu arquivo HTML sem a extensão
    }
}
