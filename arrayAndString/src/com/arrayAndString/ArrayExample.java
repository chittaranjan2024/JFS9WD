package com.arrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		//Declaration
		int arr[]=new int[10];
		int []arr1=new int[10];
		int[] arr2=new int[10];
		
		char carr[]=new char[10];
		
		//Initialization
		
		//Static initialization		
		int ar5[]= {12,34,56,78,90};
		char carr1[]= {'a','b','c','d','e'};
		
		//Dynamic initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value at "+i+" index position:");
			arr[i]=Integer.parseInt(bufferedReader.readLine());
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		//random access
		System.out.println(arr[4]);
	}

}
