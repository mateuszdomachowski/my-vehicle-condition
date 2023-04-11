package com.domachowski.myvehiclecondition.service.implementation;

import com.domachowski.myvehiclecondition.entity.Person;
import com.domachowski.myvehiclecondition.repository.PersonRepo;
import com.domachowski.myvehiclecondition.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepo personRepo;

    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public List<Person> getAll() {
        return personRepo.findAll();
    }

    @Override
    public void saveAndFlush(Person person){
        personRepo.saveAndFlush(person);
    }
}
