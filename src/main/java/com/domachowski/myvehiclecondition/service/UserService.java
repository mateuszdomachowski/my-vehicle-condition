package com.domachowski.myvehiclecondition.service;

import com.domachowski.myvehiclecondition.entity.User;
import com.domachowski.myvehiclecondition.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    private UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public void saveUser(User user) {
        if (userRepo.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("User exists");
        }
        userRepo.save(user);
    }
}
