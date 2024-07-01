package org.test.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		int a=10, b=20,c=30;
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a-b);
		try
		{
		  System.out.println(a/5);
		  String st="hello";// [h,e,l,l,o]  4
		  System.out.println(st.charAt(10));
		}
		
		//specific to generic
		catch(ArithmeticException  | StringIndexOutOfBoundsException e)
		{
			System.out.println("Arithnetic and ArrayIndex exception handled");
		}
		
		catch(NullPointerException e)
		{
			
		}
		
		catch(NumberFormatException e)
		{
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			//rest of the code
			System.out.println(Math.pow(a, b));
			System.out.println(Math.sqrt(a));
			System.out.println(Math.sqrt(b));
	}
	}
}
