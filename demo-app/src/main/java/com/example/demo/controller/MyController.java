package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String home()//request handler method
	{
		return "Hello user!!";
	}
	
	@RequestMapping("/about")
	public String aboutus()
	{
		return "We are learning spring boot 3!!";
	}
}
