package com.arrayAndString;

public class JaggedArray {

	public static void main(String[] args) {
		
		int rows=5;
		
		//2D array with 5 rows
		int arr[][]=new int[rows][];

		//
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new int[i+1];  //0th row - 1 // 1st row - 2  // 2nd row - 3
		}   
		
		
		
		int count=0;
		for(int i=0;i<arr.length;i++)             // 0
		{										  // 1 2	
			for(int j=0;j<arr[i].length;j++) {    // 3 4 5
				arr[i][j]=count++;                // 6 7 8 9
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
