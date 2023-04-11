package com.domachowski.myvehiclecondition.controller;

import com.domachowski.myvehiclecondition.entity.Person;
import com.domachowski.myvehiclecondition.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
public class Controller {
    @Autowired
    PersonRepo personRepo;

    @GetMapping("/test")
    public String testWorking(){
        return "Działa";
    }

    @PostMapping("/add/{firstname}/{lastname}")
    public ResponseEntity addPerson(@PathVariable String firstname, @PathVariable String lastname){
        //personRepo.save(new Person(firstname, lastname, firstname+lastname+"@email.com"));
        return  ResponseEntity.ok(personRepo.save(new Person(firstname, lastname, firstname.toLowerCase()+lastname.toLowerCase()+"@email.com")));
    }

}
