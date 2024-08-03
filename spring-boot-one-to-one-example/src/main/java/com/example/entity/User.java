package com.example.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

/*
 * 
 *  @Entity: Marks the class as an entity.
	@Id: Marks the field as the primary key.
	@GeneratedValue: Specifies the strategy for generating values for the primary key.
	@OneToOne: Defines a one-to-one relationship with the UserProfile entity.
	mappedBy: Specifies the field in the UserProfile entity that owns the relationship.
	cascade: Specifies the cascade operations.
	fetch: Specifies the fetch type (lazy loading).
	optional: Indicates whether the relationship is optional.
 */


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JsonManagedReference
    private UserProfile userProfile;

    public User() {}

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        if (userProfile == null) {
            if (this.userProfile != null) {
                this.userProfile.setUser(null);
            }
        } else {
            userProfile.setUser(this);
        }
        this.userProfile = userProfile;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", username='" + username + '\'' + ", email='" + email + '\'' + '}';
    }
}
