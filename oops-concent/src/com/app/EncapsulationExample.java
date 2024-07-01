package com.app;
import java.rmi.ConnectException; 
import java.rmi.*;
class Book
{
	private int id;
	private String name;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
public class EncapsulationExample {

	public static void main(String[] args) {

    Book  book=new Book(101,"Programming in Java");
   
    book.setId(345);
    book.setName("Programming in c++");
    
    System.out.println(book.getId());
    System.out.println(book.getName());
	}

}
