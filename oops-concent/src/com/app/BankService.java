package com.app;

public class BankService {

	public static void main(String[] args) {
		//objects are stored heap memory
		Customer customer1=new Customer();
		Customer customer2=new Customer(111,"Mr. Ashok","Chennai",50000);
		 //customer3=new Customer(customer2);
		//shallow copy & deep copy
		Customer customer3=customer2;
		
		customer2.deposit(1000);
		
		customer2.withdraw(15000);
		
		
		//toString() - it prints objects as string located at Object class
		System.out.println(customer1.display());
		System.out.println(customer2.display());
		System.out.println(customer3.display());
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		

	}

}
