package collection.com.app;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<Integer>();//10
		
		vector.add(11);
		vector.add(22);
		vector.add(33);
		vector.add(44);
		vector.add(55);
		vector.add(66);
		
		System.out.println(vector.capacity());
		vector.addElement(77);
		vector.add(3, 99);
		System.out.println("Element at:"+vector.elementAt(0));
		vector.ensureCapacity(20);
		System.out.println("First Element:"+vector.firstElement());
		
		
		vector.forEach(x -> System.out.println(x));

	}

}
