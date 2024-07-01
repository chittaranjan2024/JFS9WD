package org.test.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		
		int a;
		
		
		try(
				Scanner scanner=new Scanner(System.in);
				BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
				
				) //Java 7 - one resource per try catch
		{
			System.out.println("Enter a number:");
			a=scanner.nextInt();
			int fact=1;
			for(int i=1;i<=a;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial:"+fact);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		finally
		{
			//scanner.close();
		}

	}

}
