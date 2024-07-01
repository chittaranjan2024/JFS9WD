package single.linkedlist;


class Link
{
	public int key;
	public int data;
	public Link next;
	
	public Link(int key,int data)
	{
		this.key=key;
		this.data=data;
		
	}
	
	public void display()
	{
		System.out.print("{"+key+","+data+"}");
	}
}


public class SingleLinkedList {
	
	private Link first;
	
	public SingleLinkedList()
	{
		first=null;
	}
	
	public void insertFirst(int key,int data)
	{
		Link link=new Link(key,data);
		link.next=first;
		first=link;
	}
	
	
	public Link deleteFirst()
	{
		Link tempLink=first;
		first=first.next;
		return tempLink;
	}
	
	
	public Link delete(int key)
	{
		Link current=first;
		Link previous=null;
		
		if(first==null)//empty
		{
			return null;
		}
		
		while(current.key!=key)
		{
			if(current.next==null)
			{
				return null;
			}
			else
			{
				previous=current;
				current=current.next;
			}
		}
		
		if(current==first)
		{
			first=first.next;
		}
		else
		{
			previous.next=current.next;
		}
		
		return current;
		
	}
	
	public void display()
	{
		Link currentLink=first;
		System.out.print("[");
		while(currentLink!=null) 
		{
			currentLink.display();
			currentLink=currentLink.next;
			System.out.print(" ");
		}
		System.out.print("]");
		
	}

	public static void main(String[] args) {
		

		
		SingleLinkedList linkedList=new SingleLinkedList();
		linkedList.insertFirst(1, 10);
		linkedList.insertFirst(2, 20);
		linkedList.insertFirst(3, 30);
		linkedList.insertFirst(4, 40);
		linkedList.insertFirst(5, 50);
		
		linkedList.display();
		
		linkedList.deleteFirst();
		
		System.out.println();
		linkedList.display();
		
		
		System.out.println();
		linkedList.delete(5);
		linkedList.display();
		
	}

}
