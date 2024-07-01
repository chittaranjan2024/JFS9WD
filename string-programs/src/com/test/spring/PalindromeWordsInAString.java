package com.test.spring;

import java.util.Scanner;

public class PalindromeWordsInAString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string:");
		String st=scanner.nextLine();
		String rev="";
		String sarray[]=st.split(" ");
		// 0123456789.... 
		//[My dad bought me a racecar]
         //          0     1      2        3    4    5		
		//sarray=["My", "dad", "bought", "me" "a" "racecar"]
		
		for(int i=0;i<sarray.length;i++)
		{
			String word=sarray[i];  //My , dad	, bought
			
			if(word.length()>1)
			{
				for(int j=word.length()-1;j>=0;j--) 
				{
					rev=rev+word.charAt(j); 
				}
				
				if(rev.equals(word))
				{
					System.out.print(word+" ");
				}
				rev="";
			}
		}
	}

}
