package codekata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		int size=Integer.parseInt(bufferedReader.readLine());
		
		String input=bufferedReader.readLine();
		
		System.out.println(input);
		
		String array[]=input.split(" ");
		int length=array.length;
		Map<Long, String> map=new HashMap<Long, String>();
		for(int i=0;i<array.length-1;i++)
		{
			map.put(new Long(array[i+1]), array[i]);
		}
		
		System.out.println(map);

	}

}
