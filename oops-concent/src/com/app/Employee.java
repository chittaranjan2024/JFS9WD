package com.app;

public class Employee {

	//non static variable
	 long id=100;
	 String name;
	 
	 //static variable - class area
	 static String companyName="ITS College";
	 
	 //executes at class loading time
	 static
	 {
		// System.out.println(this.id);
		 System.out.println(companyName);
		 System.out.println("Hello there!!");
	 }
	 
	 public void demo()
	 {
		 System.out.println(companyName);
		 System.out.println(this.id);
	 }
	 
	 //inside a static context only static variables are allowed
	 //inside a non-static context both  static and non-statuic variables are allowed

	public Employee() {
		
	}

    
	public Employee(long id, String name) {
		
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
    
	//static method belongs to the class area and shared across all the objects
	static public void getCompanyName()
	{
		System.out.println(companyName);
	}

	public static void main(String[] args) {
		
		Employee employee1=new Employee(234,"Mr.Shiva");
		Employee employee2=new Employee(876,"Mr.Kumar");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee1.companyName);
		System.out.println(employee2.companyName);
		
		System.out.println(Employee.companyName);
		
		employee1.getCompanyName();
		Employee.getCompanyName();
	}

}
