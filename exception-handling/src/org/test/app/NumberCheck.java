package org.test.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCheck {

	//declaring purpose
	public static void main(String[] args) throws IOException  {


		BufferedReader bufferedReader=new  BufferedReader(new InputStreamReader(System.in));
		int a;
		bufferedReader.close();
		try 
		{
			a=Integer.parseInt(bufferedReader.readLine());
			//FileReader fileReader=new FileReader("C://test.text");
		} 
		catch (NumberFormatException | IOException x) {
			
			x.printStackTrace();
		}
	}

}
