package com.app;

public class Overloading {

	public void addition(int a, int b )
	{
		System.out.println(a+b);
	}

	public void addition(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public void addition(float a, float b )
	{
		System.out.println(a+b);
	}
	
	public void addition(float a, float b, float c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Overloading overloading=new Overloading();
		overloading.addition(10, 20);
		overloading.addition(10.6f, 20.7f,20.5f);
	}

}
