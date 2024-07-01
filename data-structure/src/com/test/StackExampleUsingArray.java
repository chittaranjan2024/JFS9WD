package com.test;
class Stack
{
	static final int MAX=100;
	int top;
	int a[]=new int[MAX];
	
	Stack()
	{
		top=-1;
	}
	boolean isEmpty()
	{
		return (top<0);
	}
	
	
	boolean push(int x)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack Overflow!!");
			return false;
		}
		else
		{
			a[++top]=x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow!!");
			return 0;
		}
		else
		{
			int x=a[top];
			top=top-1;
			return x;
		}
	}
	
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack underflow!!");
			return 0;
		}
		else
		{
			int x=a[top];
			return x;
		}
	}
	
	void print()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
public class StackExampleUsingArray {

	public static void main(String[] args) {
		
      Stack stack=new Stack();
      stack.push(10);
      stack.push(20);
      stack.push(30);
      
      stack.print();
      
      stack.pop();
      stack.print();
      
      System.out.println(stack.peek());
      System.out.println(stack.isEmpty());
      
	}

}
