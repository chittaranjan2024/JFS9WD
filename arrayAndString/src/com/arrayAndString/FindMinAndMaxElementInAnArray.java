package com.arrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMinAndMaxElementInAnArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value at "+i+" index position:");
			arr[i]=Integer.parseInt(bufferedReader.readLine());
		}
		// 0   1  2  3  4  5
		//[23,78,11,25,99,33]
		
		int max=arr[0]; //assumption //max=23
		int min=arr[0]; 
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i]; //max=78 max=99
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		
		System.out.println("Maximum:"+max);
		System.out.println("Maximum:"+min);

	}

}
