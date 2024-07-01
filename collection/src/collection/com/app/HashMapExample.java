package collection.com.app;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String , String> map1=new TreeMap<String, String>();
		Map<String , String> map=new HashMap<String, String>();
		
		map.put("A", "Apple");
		map.put("B", "Ball");
		map.put("C", "Cat");
		map.put("D", "Dog");
		
		for(Map.Entry<String, String> m:map.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		map.replace("B", "Bat");
		
		map.remove("C");
		map.remove("D","Dog");
		
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue("Ball"));
		System.out.println(map.get("B"));
		
		System.out.println(map.getOrDefault("E", "Elephant"));
		
	}

}
