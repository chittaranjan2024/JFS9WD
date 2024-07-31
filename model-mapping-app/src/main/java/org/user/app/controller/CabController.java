package org.user.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.user.app.entities.Car;
import org.user.app.entities.Driver;
import org.user.app.repository.CarRepository;
import org.user.app.repository.DriverRepository;

@RestController
@RequestMapping("/cab")
public class CabController {

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private DriverRepository driverRepository;
	
	
	
	@PostMapping("/car")
	public Car addCar(@RequestBody Car car)
	{
		//this.driverRepository.save(car.getDriver());
		return this.carRepository.save(car);
		
	}
	
	@GetMapping("/car/{id}")
	public Car getCarById(@PathVariable("id")long id)
	{
		return this.carRepository.findById(id).get();
	}
	
	
	@GetMapping("/driver/{id}")
	public Driver getDriverById(@PathVariable("id")long id)
	{
		return this.driverRepository.findById(id).get();
	}
	
	@DeleteMapping("/car/{id}")
	public String deleteCarById(@PathVariable("id")long id)
	{
		this.carRepository.deleteById(id);
		return "Car deleted";
	}
	
	@DeleteMapping("/driver/{id}")
	public String deleteDriverById(@PathVariable("id")long id)
	{
		this.driverRepository.deleteById(id);
		return "Driver deleted";
	}
}
