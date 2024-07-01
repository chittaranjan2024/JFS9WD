package com.test;
import java.util.prefs.*;
import java.util.prefs.InvalidPreferencesFormatException;
class Sample
{
	int a,b;
	Sample()
	{
		int a=7,b=8;
		this.a=10;
		this.b=20;
		System.out.println("constrctor called");
		System.out.println(this.a + " "+this.b);
	}
	
	Sample(String st)
	{
		System.out.println(st);
	}
	
	public void addition(int a,int b)
	{
		System.out.println(a+b);
		System.out.printf(" %d ",a+b);
	}
	
	
	public static void addition1(int a,int b)
	{
		System.out.println(a+b);
		System.out.printf(" %d ",a+b);
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		
		int b;
		b=10;
		
		int c=10;
		
		Sample object=new Sample();
		object.addition(10, 20);
		object.a=90;
		object.b=56;
		
		String st="yjgjgjg";
		String st1=new String("kuhbhbhn");
		
		Sample object1=new Sample("test");
		Sample.addition1(2, 5);
		
		int a=10;
		
		float b=a;//10.0
		
		float c=(float)a;
	}

}
