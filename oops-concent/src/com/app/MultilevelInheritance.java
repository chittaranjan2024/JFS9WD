package com.app;

 class A { //parent/base//super

	int a=10;
	
	
	public A() {
		
	}


	void testA()
	{
		System.out.println("testA method called");
	}
	
	
}


class B extends A//child/derived
{
	int b=20;
	
	public B() {
		super();
	}

	public void testB()
	{
		System.out.println("testB method called");
		System.out.println(super.a); 
		super.testA();
		
	}
}


class MultilevelInheritance
{
	public static void main(String args[])
	{
		B b=new B();
		System.out.println(b.a);
		b.testA();
		
	}
}
