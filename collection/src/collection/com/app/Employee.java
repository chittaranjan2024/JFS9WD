package collection.com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee {
	 
	
	 private long id;
	 private String name;
	 private double salary;
	 
	 
	 
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(long id, String name, double salary) {
		
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String args[])
	{
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(11, "A", 10000));
		employees.add(new Employee(33, "H", 15000));
		employees.add(new Employee(66, "C", 30000));
		employees.add(new Employee(22, "K", 37000));
		employees.add(new Employee(55, "Z", 45000));
		
		System.out.println("Before Sorting:");
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}	
		
		
		Collections.sort(employees, new NameComparator());
		System.out.println("After Sorting:");
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
		
		
		Collections.sort(employees,new SalaryCOmparator());
		
		System.out.println("After Sorting:");
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
		
	}
  
}
