package collection.com.app;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(66);
		set.add(11);
		
		System.out.println(set.contains(55));
		System.out.println(set.isEmpty());
		set.remove(44);
		
		
		set.add(99);
		set.add(111);
		System.out.println(set.size());
		
		
		
		
		
		set.forEach(x->System.out.println(x));
		

	}

}
