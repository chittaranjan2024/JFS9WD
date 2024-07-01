package com.data.structure;
class Stack
{
	//stack size
	static int MAX=100;
	//top of stack pointer
	int top=-1;
	//array for storing stack elements
	int a[]=new int[MAX];
	
	boolean isEmpty()
	{
		return (top<0); //checking stack is empty or not
	}
	
	boolean push(int x)
	{
		if(top>=(MAX-1)) //checking if stack is full
		{
			System.out.println("Overflow condition occurred!!");
			return false;
		}
		else
		{
			top++;
			a[top]=x;   //pushing the new value into the stack
			System.out.println(x+" pushed into the stack!");
			return true;
		}
	}
	
	
	int pop()
	{
		if(top<0) //checking for underflow
		{
			System.out.println("Underflow condition occurred!!");
			return 0;
		}
		else
		{
			int x=a[top];//removing the element from the stack
			top--;
			return x;
		}
	}
	
	int peek()
	{
		if(top<0)
		{
			System.out.println("Underflow condition occurred!!");
			return 0;
		}
		else
		{

			int x=a[top];//getting the element from the top of the stack
			return x;
		}
	}
	
	void display()
	{
		if(!isEmpty())
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
		else
		{
			System.out.println("Underflow condition occurred!!");
		}
	}
	
	
}
public class StackImplementation {

	public static void main(String[] args) {
		
		
		Stack stack=new Stack();
		
		stack.push(12);
		stack.push(15);
		stack.push(19);
		stack.push(27);
		stack.push(89);
		
		stack.display();
		
		System.out.println("\n Deleted element: "+stack.pop());
		
		stack.display();
		
		System.out.println("\n Fetched element: "+stack.peek());
		
	}

}
