package org.user.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.user.app.model.User;
import org.user.app.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	//@RequestMapping(value="/user",method = RequestMethod.POST)
	@PostMapping(path = "/user")
	public ResponseEntity<User> saveUserData(@Valid @RequestBody User user)
	{
		return new ResponseEntity<User>( this.userService.addUser(user),HttpStatus.CREATED); //200 -OK 201-CREATED
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> findAllUsers()
	{
		return  new ResponseEntity<List<User>>(this.userService.getUsers(),HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> findUserById(@PathVariable("id")Long id) throws Exception
	{
		Optional<User> user=this.userService.getUserById(id);
		
		if(user.isPresent())
		{
			return  new ResponseEntity<User>(this.userService.getUserById(id).get(),HttpStatus.OK);
		}
		else
		{
			throw new Exception("User not found!!");
		}
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user, @PathVariable("id")Long id) throws Exception
	{
		Optional<User> existingUser=this.userService.getUserById(id);
		if(existingUser.isPresent())
		{
			
			if(user.getName()!=null)
			{
				existingUser.get().setName(user.getName());
			}
			
			if(user.getCity()!=null)
			{
				existingUser.get().setCity(user.getCity());
			}
			if(user.getEmail()!=null)
			{
				existingUser.get().setEmail(user.getEmail());
			}
			
			//System.out.println(existingUser.get());
			
			return  new ResponseEntity<User>(this.userService.updateUser(existingUser.get()),HttpStatus.OK);
		}
		else
		{
			throw new Exception("User not found!!");
		}
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id")Long id) throws Exception
	{
		Optional<User> existingUser=this.userService.getUserById(id);
		if(existingUser.isPresent())
		{
			this.userService.deleteUserById(id);
			return  new ResponseEntity<>("User deleted!!",HttpStatus.OK);
		}
		else
		{
			throw new Exception("User not found!!");
		}
	}
	
	
}
