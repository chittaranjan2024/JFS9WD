package com.app;

 class A1 { //parent/base//super

	int a=10;
	void testA()
	{
		System.out.println("testA method called");
	}
	
	
}

//A1 -> B1 -> C1
class B1 extends A1//child/derived
{
	int b=20;
	public void testB()
	{
		System.out.println("testB method called");
	}
}


class C1 extends B1//child/derived
{
	int c=30;
	public void testC()
	{
		System.out.println("testB method called");
	}
}

class MultilevelInheritance
{
	public static void main(String args[])
	{
		B1 b=new B1();
		System.out.println(b.a);
		b.testA();
		
		C1 c1=new C1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.testA();
		c1.testB();
		
	}
}
