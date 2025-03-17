package com.example.ptfBackEnd.controllers;

import com.example.ptfBackEnd.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    // Injeção da classe Person (a instância de Person será configurada automaticamente pelo Spring)
    private final Person person;

    @Autowired
    public PersonController(Person person) {
        this.person = person;
    }

    // Método GET que retorna os dados de person como JSON
    @GetMapping("/person")
    public Person getPerson() {
        return person;
    }
}
