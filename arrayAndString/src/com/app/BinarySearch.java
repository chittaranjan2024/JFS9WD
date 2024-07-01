package com.app;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {12,45,66,89,92,163,234,345};
		int low=0, upper=arr.length-1;
		int key=234;
		
		boolean flag=false;
		while(low<=upper)
		{
			int mid=(low+upper)/2;
			
			if(arr[mid]==key)
			{
				flag=true;
				System.out.println("Element  present at "+mid+ " index");
				break;
			}
			else if(arr[mid]>key)
			{
			  upper=mid-1;	
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not present!!");
		}
		

	}

}
