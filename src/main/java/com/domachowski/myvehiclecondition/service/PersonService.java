package com.domachowski.myvehiclecondition.service;

import com.domachowski.myvehiclecondition.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    List<Person> getAll();
    void saveAndFlush(Person person);
}
