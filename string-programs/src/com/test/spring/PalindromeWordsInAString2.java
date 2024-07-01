package com.test.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PalindromeWordsInAString2 {

	public static void main(String[] args) {
		NumberFormatException
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string:");
		String st=scanner.nextLine();
		String rev="",word="";
		st=st+" ";
		
		// 0123456789.... 
		//[My dad bought me a racecar]
         //          0     1      2        3    4    5		
		//sarray=["My", "dad", "bought", "me" "a" "racecar"]
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i); //bought
			if(ch!=' ') //
			{
				word=word+ch; //word=bought
			}
			else if(ch==' ')
			{   
				//System.out.println(word);
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
				word="";
			    }
				else
				{
					rev="";
					word="";
				}		
				
		}
	}

	}
}
