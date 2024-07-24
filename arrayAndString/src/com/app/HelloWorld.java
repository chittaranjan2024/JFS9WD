package com.app;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class HelloWorld {
 public static void main(String[] args) {
     int n=5;
     for(int i=1;i<=n;i++)
     {
         
         for(int j=1;j<=i+1;j++)
         {
        	 int x=0;
             for(int k=1;k<=j;k++)
             {
            	 x=x+n-k;
	             if(j%2==0)
	             {
	                 System.out.print(x+i-j+1+" ");
	             }
	             else
	             {
	                 System.out.print(" ");
	             }
             }
             System.out.println(); 
         }
     }
     
 }
}
