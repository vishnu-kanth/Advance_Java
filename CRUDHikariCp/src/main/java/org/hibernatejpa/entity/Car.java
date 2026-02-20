package org.hibernatejpa.entity;

import jakarta.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private double price;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    // Default constructor
    public Car() {
    }

    // Constructor
    public Car(String brand, double price, Vehicle vehicle) {
        this.brand = brand;
        this.price = price;
        this.vehicle = vehicle;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}