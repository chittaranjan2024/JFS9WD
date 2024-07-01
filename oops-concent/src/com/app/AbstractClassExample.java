package com.app;
abstract class Shape
{
	String color;
	
	//abstract methods
	abstract double area();
	public abstract String toString();
	
	public Shape() {
		
	}
	public Shape(String color) {
		
		System.out.println("Shape constructor invoked");
		this.color = color;
	}
	//concrete method
	public String getColor() {
		return color;
	}
		
}

class Circle extends Shape
{

	int radius;
	
	
	
	public Circle() {

	}


	public Circle(int radius,String color) {
		super(color);
		this.radius = radius;
	}

	double area() {
		
		return Math.PI* this.radius * this.radius;
	}

	
	public String toString() {
		
		return "color:"+this.color+"\n Area:"+this.area();
	}
	
}

class Rectangle extends Shape
{
	double length;
	double width;

	
	
	public Rectangle(double length, double width) {
			
		this.length = length;
		this.width = width;
	}

	
	double area() {
		
		return this.length * this.width;
	}

	
	public String toString() {
		
		return  "\n Area:"+this.area();
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		
		Shape shape=new Circle(6,"Red");
		System.out.println(shape.area());
		
		
		Shape shape2=new Rectangle(5.6, 4.8);
		System.out.println(shape2.area());
		
		

	}

}
