package com.example.ptfBackEnd.controllers;

import com.example.ptfBackEnd.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  
    private final Person person;

    @Autowired
    public PersonController(Person person) {
        this.person = person;
    }


    @GetMapping("/person")
    public Person getPerson() {
        return person;
    }
}
