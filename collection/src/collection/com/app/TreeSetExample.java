package collection.com.app;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet< Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(55);
		treeSet.add(66);
		treeSet.add(11);
		treeSet.add(33);
		treeSet.add(44);
		treeSet.add(77);
		treeSet.add(22);
		treeSet.add(11);
		//treeSet.add(null);
		
		treeSet.forEach(x-> System.out.println(x));
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());

	}

}
