package com.domachowski.myvehiclecondition.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @Column(name = "vehicle_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long vehicleId;
//    @ManyToOne
//    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
//    private Long personId;
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
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = com.domachowski.myvehiclecondition.entity.Person.class)
    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
    private Person person;
}
