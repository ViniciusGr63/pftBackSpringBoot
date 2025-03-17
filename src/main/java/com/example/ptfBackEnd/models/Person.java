package com.example.ptfBackEnd.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Value("${person.email}")
    private String email;

    @Value("${person.address}")
    private String address;

    @Value("${person.gender}")
    private String gender;

    @Value("${person.maritalStatus}")
    private String maritalStatus;

    @Value("${person.profession}")
    private String profession;

   
    public Person() {}

   
    public Person(String name, int age, String email, String address, String gender, String maritalStatus, String profession) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

