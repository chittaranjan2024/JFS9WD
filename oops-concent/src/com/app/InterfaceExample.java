package com.app;
interface Vehicle
{
	int initialSpeedForBiCycle=5;
	int initialSpeedForBike=10;
   void changeGear(int a);
   void speedUp(int a);
   void applyBrakes(int a);
   
}

class BiCycle implements Vehicle
{
	int speed;
	int gear;
	BiCycle()
	{
		this.speed=initialSpeedForBiCycle;
	}
	
	
	public void changeGear(int gear) {
	
		this.gear=gear;
		
	}

	
	public void speedUp(int speed) {
		
		this.speed=this.speed + speed;
		
	}

	
	public void applyBrakes(int speed) {
		
		this.speed=this.speed - speed;
		
	}
	
	public void printStates()
	{
		System.out.println("Speed:"+this.speed +" "+" Gear:"+this.gear);
	}
	
}

class Bike implements Vehicle
{
	int speed;
	int gear;
	
	
	public Bike() {
		this.speed=initialSpeedForBike;
	}

	@Override
	public void changeGear(int gear) {
	
		this.gear=gear;
		
	}

	@Override
	public void speedUp(int speed) {
		
		this.speed=this.speed + speed;
		
	}

	@Override
	public void applyBrakes(int speed) {
		
		this.speed=this.speed - speed;
		
	}
	
	public void printStates()
	{
		System.out.println("Speed:"+this.speed +" "+" Gear:"+this.gear);
	}
	
}
public class InterfaceExample {

	
	public static void main(String args[])
	{
		BiCycle biCycle=new BiCycle();
		biCycle.changeGear(2);
		biCycle.speedUp(10);
		biCycle.printStates();
		
		
		
		Bike bike=new Bike();
		bike.changeGear(3);
		bike.speedUp(40);
		bike.applyBrakes(15);
		bike.printStates();
		
	}
}
