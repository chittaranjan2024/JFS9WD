package com.arrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

		int ar[][][]= {
				{{11,22,33,44},{55,66,77,88}},
				{{99,111,222,333},{444,555,666,777}},
				{{888,999,1111,2222},{3333,4444,5555,6666}},
		};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.print(ar[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		int arr[][][]=new int[3][3][3];
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.println("Enter value at "+i+" "+j +"position");
					arr[i][j][k]=Integer.parseInt(bufferedReader.readLine());
				}
				
			}
			

		}
	}

}
