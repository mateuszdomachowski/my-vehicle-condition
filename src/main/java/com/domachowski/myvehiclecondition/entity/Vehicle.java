package com.domachowski.myvehiclecondition.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "mileage")
    private String mileage;

    @Column(name = "what_was_made")
    private String whatWasMade;

}
