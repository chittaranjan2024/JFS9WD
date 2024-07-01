package com.test;
class Queue
{
	static private int capacity;
	private static  int rear;
	private static  int front;
	static private int queue[];
	
	Queue(int c)
	{
		capacity=c;
		rear=front=0;
		queue=new int[capacity];
	}
	
	static void enqueue(int data)
	{
		if(capacity==rear)
		{
			System.out.println("Queue is full!!");
			return;
		}
		else
		{
			queue[rear]=data;
			rear++;
		}
		return;
	}
	
	
	static void dequeue()
	{
		if(rear==front)
		{
			System.out.println("Queue is empty!!");
			return;
		}
		else
		{
				for(int i=0;i<rear-1;i++)
				{
					queue[i]=queue[i+1];
				}
				
				if(rear<capacity)
				{
					queue[rear]=0;
				}
				
				rear--;
		}
		
		return;
		
	}
	
	
	
	static void display()
	{
		int i;
		if(front==rear)
		{
			System.out.println("Queue is empty!!");
			return;
		}
		for(i=front;i<rear;i++)
		{
			System.out.print(queue[i]+ " ");
		}
		System.out.println();
		return;
	}
	
}
public class QueueExampleUsingArray {

	public static void main(String[] args) {
	
		Queue queue=new Queue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.display();
		
		queue.dequeue();
		queue.dequeue();
		
		queue.display();
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		
	}

}
