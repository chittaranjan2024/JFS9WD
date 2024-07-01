package collection.com.app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list=new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		System.out.println(list.contains("B"));
		list.remove("D");
		
		list.forEach(x->System.out.println(x));
		
		
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		list.clear();

	}

}
