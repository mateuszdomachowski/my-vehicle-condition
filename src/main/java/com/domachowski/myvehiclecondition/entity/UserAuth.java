package com.domachowski.myvehiclecondition.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class UserAuth {

    @Id
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "password")
    private String password;
}
