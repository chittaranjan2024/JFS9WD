package com.data.structure;
class Queue
{
	static private int front, rear, capacity;
	static private int queue[];
	
	Queue(int size)
	{
		rear=front=0;
		capacity=size;
		queue=new int[capacity];
	}
	
	
	static void queueEnqueue(int data)
	{
		if(capacity==rear)
		{
			System.out.println("\n Queue is full \n");
			return;
		}
		else
		{
			queue[rear]=data;
			rear++;
		}
	}
	
	
	static void queueDequeue()
	{
		if(rear==front)
		{
			System.out.println("\n Queue is empty \n");
			return;
		}
		
		if(rear<capacity)
		{
			queue[rear]=0;
			rear--;
		}
	}
	
	
	static void queueDisplay()
	{
		int i;
		if(rear==front)
		{
			System.out.println("\n Queue is empty \n");
			return;
		}
		
		for(i=front;i<rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
		return;
	}
	
	
	static void queueFront()
	{
		if(rear==front)
		{
			System.out.println("\n Queue is empty \n");
			return;
		}
		System.out.println("\n Front element is: "+queue[front]);
		return;
	}
	
}
public class QueueImplementation {

	public static void main(String[] args) {
		
		
		Queue queue=new Queue(5);
		
		//queue.queueDisplay();
		
		
		queue.queueEnqueue(10);
		queue.queueEnqueue(20);
		queue.queueEnqueue(30);
		queue.queueEnqueue(40);
		
		queue.queueDisplay();
		
		queue.queueEnqueue(50);
		queue.queueEnqueue(60);
		
		queue.queueDisplay();
		queue.queueDequeue();
		queue.queueDequeue();
		
		queue.queueDisplay();
		
		queue.queueFront();
		
	}

}
