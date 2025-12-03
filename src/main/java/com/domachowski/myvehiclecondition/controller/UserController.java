package com.domachowski.myvehiclecondition.controller;

import com.domachowski.myvehiclecondition.entity.User;
import com.domachowski.myvehiclecondition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }




}
