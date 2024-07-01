package com.app;

public class Customer {
	
	//instance variables  this.id
	   long id;
	   String name;
	   String city;
	   double balance;
	  
	  public Customer() //default constructor
	  { 
		  //this(111,"Mr. Ashok","Chennai",50000);
		  System.out.println("Default constructor invoked");
		 
	  }
	  
	  //parameterized constructor
	  public Customer(long id, String name, String city, double balance)
	  {
		 //this();
		 this.id=id;
		 this.name=name;
		 this.city=city;
		 this.balance=balance;
	  }
	  
	  public Customer(Customer customer) //copy one object to another object
	  {
		 this.id=customer.id;
		 this.name=customer.name;
		 this.city=customer.city;
		 this.balance=customer.balance;
	  }
	  
	  //methods
	  public void deposit(double amount)
	  {
		  if(amount>0)
		  {
			  this.balance=this.balance + amount;
			  System.out.println("Updated balance:"+this.balanceCheck());
			  
		  }
	  }

	public void withdraw(double amount)
	  {
		  if(this.balance>amount)
		  {
			  this.balance=this.balance - amount;
			  System.out.println("Updated balance:"+this.balanceCheck());
		  }
		  else
		  {
			  System.out.println("Insufficient balance!!");
		  }
	  }
	  
	  
	  public double balanceCheck()
	  {
		  return this.balance;
	  }


	public String display()
	{
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", balance=" + balance + "]";
	}
	

	public static void main(String[] args) {
		//objects are stored heap memory
		Customer customer1=new Customer();
		Customer customer2=new Customer(111,"Mr. Ashok","Chennai",50000);
		Customer customer3=new Customer(customer2);
		
		customer2.deposit(1000);
		customer2.withdraw(15000);
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		

	}
	  

}
