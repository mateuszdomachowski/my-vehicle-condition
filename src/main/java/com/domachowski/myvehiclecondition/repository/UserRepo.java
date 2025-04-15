package com.domachowski.myvehiclecondition.repository;

import com.domachowski.myvehiclecondition.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    List<User> findAll();
}
