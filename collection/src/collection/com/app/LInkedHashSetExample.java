package collection.com.app;

import java.util.LinkedHashSet;
import java.util.Set;

public class LInkedHashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(66);
		set.add(11);
		set.add(null);
		
		System.out.println(set.contains(55));
		System.out.println(set.isEmpty());
		set.remove(44);
		
		
		set.add(99);
		set.add(111);
		System.out.println(set.size());
		set.forEach(x->System.out.println(x));
		
	}

}
 