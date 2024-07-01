package com.arrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

		int arr[][]=new int[3][3];
		int arr1[][]= {       //[1,2,3]
				{1,2,3},      //[4,5,5]
				{4,5,6},      //[7,8,9]
				{7,8,9}
				};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter value at "+i+" "+j +"position");
				arr[i][j]=Integer.parseInt(bufferedReader.readLine());
				
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

}
