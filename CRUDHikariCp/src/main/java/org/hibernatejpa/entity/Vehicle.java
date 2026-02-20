package org.hibernatejpa.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Car> cars;

    // Default constructor
    public Vehicle() {
    }

    // Constructor
    public Vehicle(String type) {
        this.type = type;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}