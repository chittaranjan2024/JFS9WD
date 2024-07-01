package com.test.spring;

import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string:");
		String st=scanner.nextLine();
		
		int blanks=0,alphabets=0,digits=0,special=0, vowels=0, consonants=0;
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch==' ')
			{
				blanks++;
			}
			else if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
			{
				alphabets++;
				if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(ch>='0' && ch<='9')
			{
				digits++;
			}
			else
			{
				special++;
			}
			
		}
		
		System.out.println("No of spaces:"+blanks);
		System.out.println("No of words:"+(blanks+1));
		System.out.println("No of alphabets:"+alphabets);
		System.out.println("No of digits:"+digits);
		System.out.println("No of special characters:"+special);
		System.out.println("No of Vowels:"+vowels);
		System.out.println("No of consonants:"+consonants);
		

	}

}
