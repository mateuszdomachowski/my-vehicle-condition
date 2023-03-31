package com.domachowski.myvehiclecondition.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Column(name = "vehicle_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long vehicleId;
    @Column(name = "person_id")
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
    private Long personId;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "registration_number")
    private String registrationNumber;
    @Column(name = "mileage")
    private String mileage;
    @Column(name = "what_was_made")
    private String whatWasMade;
}
