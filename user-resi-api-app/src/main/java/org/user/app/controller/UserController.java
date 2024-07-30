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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.user.app.model.User;
import org.user.app.repository.UserRepository;
import org.user.app.service.UserService;
import org.user.app.validation.UserIdNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name="User Controller",description = "CRUD operations on User Entity")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	//@RequestMapping(value="/user",method = RequestMethod.POST)
	@PostMapping(path = "/user")
	public ResponseEntity<User> saveUserData(@Valid @RequestBody User user)
	{
		return new ResponseEntity<User>( this.userService.addUser(user),HttpStatus.CREATED); //200 -OK 201-CREATED
	}
	
	
	
	@Operation(
			summary = "Retrieve all users", 
			description = "This endpoint returns all users in a json array ", 
			tags = {"user","get"})
	@ApiResponses({
		@ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = User.class),mediaType = "application/json")})
	})
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
			throw new UserIdNotFoundException("User not found!!");
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
	//  /user/123
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
	
	
	//query parameter - /city?name=mumbai
	@GetMapping("/city")
	public ResponseEntity<?> getUsersByCity(@RequestParam("cityname")String city)
	{
		List<User> users=this.userRepository.findByCity(city);
		
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		
	}
	
	//query parameter - /city?name=mumbai
	@GetMapping("/findbyname")
	public ResponseEntity<?> getUsersByName(@RequestParam("name")String name)
	{
		List<User> users=this.userRepository.getUsersByName(name);
		
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		
	}
	
	@GetMapping("/findbynameandcity")
	public ResponseEntity<?> getUsersByName(@RequestParam("uname")String name,@RequestParam("city")String city)
	{
		List<User> users=this.userRepository.getUsersByNameAndCity(name, city);
		
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		
	}
	
	@GetMapping("/findall")
	public ResponseEntity<?> getAllUsers()
	{
		List<User> users=this.userRepository.getAllUsers();
		
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		
	}
}
