package com.test.spring;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        String userInput[] = obj.nextLine().split(" ");
      
        for(int i=0;i<userInput.length;i++)
        {
        	System.out.print(userInput[i]+" "); 
        }
    }
}