package collection.com.app;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		
		System.out.println(list.contains(22));
		System.out.println(list.indexOf(66));
		list.set(0, 10);
		
		System.out.println(list.get(3));
		
		list.forEach(x-> System.out.println(x));//lambda expression
		list.remove(2);
		
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(44));
		
		
		

	}

}
