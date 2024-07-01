package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee
{
	private long id;
	private String name;
	private String city;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String name, String city, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
public class EmployeeExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		Employee employee=new Employee();
		
		System.out.println("Enter employee id:");
		employee.setId(Long.parseLong(bufferedReader.readLine()));
		System.out.println("Enter employee name:");
		employee.setName(bufferedReader.readLine());
		System.out.println("Enter employee city:");
		employee.setCity(bufferedReader.readLine());
		System.out.println("Enter employee salary:");
		employee.setSalary(Double.parseDouble(bufferedReader.readLine()));
		
		System.out.println(employee);
		
		
		Employee employee2=new Employee(Long.parseLong(bufferedReader.readLine()), 
				bufferedReader.readLine(), 
				bufferedReader.readLine(), 
				Double.parseDouble(bufferedReader.readLine()));
		System.out.println(employee2);

	}

}
