package com.test.spring;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecking {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String st1=scanner.nextLine();
		
		System.out.println("Enter first string:");
		String st2=scanner.nextLine();
		
		char array1[]=st1.toCharArray();
		char array2[]=st2.toCharArray();
		
		Arrays.sort(array1);//SILENT 
		Arrays.sort(array2);//LISTEN
		
		boolean flag=true;
		
		
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]!=array2[i])
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println(st1+ " and "+st2+" are Anagram of each other");
		}
		else
		{
			System.out.println(st1+ " and "+st2+" are not Anagram of each other");
		}


		
		

	}

}
