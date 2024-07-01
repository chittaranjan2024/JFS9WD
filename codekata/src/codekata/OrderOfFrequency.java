package codekata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OrderOfFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {

			int count = 1;
			arr[i] = scan.nextInt();
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			map.put(arr[i], count);
		}

		System.out.println(map);

		/*
		 * int sorted[]; Iterator<Map.Entry<Integer, Integer>> itr =
		 * map.entrySet().iterator(); while(itr.hasNext()) { Map.Entry<Integer, Integer>
		 * entry = itr.next(); System.out.print(entry.getKey()+" "); }
		 * 
		 * Collection<Integer> values= map.values(); Set<Integer> keys=map.keySet();
		 * 
		 * System.out.println(values); System.out.println(keys);
		 */

	}

}
