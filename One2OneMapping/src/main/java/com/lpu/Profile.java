package com.lpu;

import jakarta.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String phone;

    public Profile() {}

    public Profile(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    // getters and setters
}
