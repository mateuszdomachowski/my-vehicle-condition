package com.domachowski.myvehiclecondition.controller;

import com.domachowski.myvehiclecondition.entity.User;
import com.domachowski.myvehiclecondition.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;


    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }


}
