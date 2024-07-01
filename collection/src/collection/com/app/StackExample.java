package collection.com.app;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>(); 

		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		stack.push(66);
		
		stack.pop();
		stack.pop();
		
		
		
		for(Integer i:stack)
		{
			System.out.println(i);
		}
		
		System.out.println(stack.peek());
		
		System.out.println(stack.add(66));

		
		
	}

}
