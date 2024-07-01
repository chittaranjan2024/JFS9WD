package com.app;

class X
{
	void testX()
	{
		System.out.println("Parent class method");
	}
}
class Y extends X
{
	void testY()
	{
		System.out.println("Y class method");
	}
}

class Z extends X
{
	void testZ()
	{
		System.out.println("Z class method");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {

		Y y=new Y();
		Z z=new Z();
		
		y.testX();
		z.testX();

	}

}
