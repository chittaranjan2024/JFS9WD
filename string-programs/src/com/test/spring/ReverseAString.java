package com.test.spring;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any string:");
		String st=scanner.nextLine();
		//        01234
		//input - Hello - 5
		//output - olleH
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--) //4 3 2 1 0 -1
		{
			rev=rev+st.charAt(i); //olleH
		}
		
		System.out.println(rev);
		
		
		StringBuffer buffer=new StringBuffer(scanner.nextLine());
		System.out.println(buffer.reverse());
		 
	}

}
