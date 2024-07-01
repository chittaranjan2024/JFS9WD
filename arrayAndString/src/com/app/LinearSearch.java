package com.app;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {12,56,3,8,23,90,66,88};
		int key=8;
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				flag=true;
				System.out.println("Element  present at "+i+ " index");
				break;
			}
		}
		
		
		if(flag==false)
		{
			System.out.println("Element not present!!");
		}

	}

}
