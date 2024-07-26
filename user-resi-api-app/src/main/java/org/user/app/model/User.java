package org.user.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	@NotEmpty(message = "username can not be empty")
	@Size(min=2, message="user name should have at least 2 characters")
	private String name;
	
	
	@Column(nullable = false)
	@NotEmpty(message = "city can not be empty")
	private String city;
	
	@NotEmpty(message = "Email can not be empty")
	@Email(message = "Wrong email format")
	private String email;
	public User() {
		
	}
	public User(long id, String name, String city, String email) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}
	
	
}
