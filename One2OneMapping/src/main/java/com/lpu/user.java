package com.lpu;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    public user() {}

    public user(String name, Profile profile) {
        this.name = name;
        this.profile = profile;
    }

    // getters and setters
}
