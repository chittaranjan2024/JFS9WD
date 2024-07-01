package com.arrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value at "+i+" index position:");
			arr[i]=Integer.parseInt(bufferedReader.readLine());
		}
		//[11 22 33 44 55 66] 0+6/2=3
		int low=0,upper=arr.length-1;
		int key=0;
		System.out.println("Enter the key element:");
		key=Integer.parseInt(bufferedReader.readLine());
		boolean flag=false;
		
		
		while(low<=upper)
		{
			int mid=(low+(upper-1))/2; //low+high/2
			
			
			if(arr[mid]==key)
			{
				flag=true;
				System.out.println(key +"present at "+mid +" index");
				break;
			}
			
			else if(arr[mid]>key)
			{
				upper=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		
		
		if(flag==false)
		{
			System.out.println(key +" is not present");
		}
		
		

	}

}
