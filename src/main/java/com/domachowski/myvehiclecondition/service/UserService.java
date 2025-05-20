package com.domachowski.myvehiclecondition.service;

import com.domachowski.myvehiclecondition.entity.User;
import com.domachowski.myvehiclecondition.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    private UserService(UserRepo userRepo, User user) {
        this.userRepo = userRepo;
    }

    public void register(User user) {
        if (userRepo.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("User exists");
        }
        userRepo.save(user);
    }
}
