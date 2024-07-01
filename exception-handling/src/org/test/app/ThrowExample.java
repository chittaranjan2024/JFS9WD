package org.test.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;


//banking - invalid Bank Account(InvalidBankAccount), Wrong credentials(WrongCredentials), Customer not found
//invalidVoter
public class ThrowExample {

	public static void main(String[] args) throws Exception {


		BufferedReader bufferedReader=new  BufferedReader(new InputStreamReader(System.in));
		int age=Integer.parseInt(bufferedReader.readLine());
		
		try
		{
			if(age<18)
			{
				throw new InvalidVoter("Not eligible for casting vote");
			}
			else
			{
				System.out.println("Eligible for voting");
			}
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}

	}

}
