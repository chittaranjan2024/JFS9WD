package com.arrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value at "+i+" index position:");
			arr[i]=Integer.parseInt(bufferedReader.readLine());
		}
		
		int key=0;
		System.out.println("Enter the key element:");
		key=Integer.parseInt(bufferedReader.readLine());
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				flag=true;
				System.out.println(key+ " present at :"+i+" index");
				break;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println(key +" is not present");
		}
		
		

	}

}
