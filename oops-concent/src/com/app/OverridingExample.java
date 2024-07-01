package com.app;
class Parent
{
	protected A show()//Overridden method
	{
		System.out.println("Parent's show method invoked...");
		return new A();
	}
}

class Child extends Parent
{
	
	public B show()//Overriding method
	{
		System.out.println("Child's show method invoked...");
		return new B();
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		
		Parent parent=new Parent();
		parent.show();
		
		//Runtime polymorphism
		Parent parent2=new Child();
		parent2.show();//late binding

	}

}
