package org.user.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
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
	
	
}
