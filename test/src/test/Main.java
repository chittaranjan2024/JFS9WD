package test;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        System.out.println("N:");
       int n = obj.nextInt();
       int length=String.valueOf(n).length();
       
       System.out.println(length);
       
       int arr[]=new int[length];
       System.out.println(Arrays.toString(arr));
       int n1=0,n2=0,r=0,i=0,k=n;
       
       while(n>0)
       {
    	   r=n%10;
    	   if(r%2==0)
    	   {
    		   n1++;
    	   }
    	   else
    	   {
    		   n2++;
    	   }
    	   arr[i]=r;
    	   i++;
    	   n=n/10;
       }
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       System.out.println(n1);
       System.out.println(n2);
       int odd[]=new int[n2];
       int even[]=new int[n1];
       System.out.println(Arrays.toString(odd));
       System.out.println(Arrays.toString(even));
       i=0;
       int j=0,l=0;
       while(k>0)
       {
    	   r=k%10;
    	   if(r%2==0)
    	   {
    		   even[j]=r;
    		   j++;
    	   }
    	   else
    	   {
    		   odd[l]=r;
    		   l++;
    	   }
    	 
    	   k=k/10;
       }
       System.out.println(Arrays.toString(even));
       System.out.println(Arrays.toString(odd));
       for(i=0;i<even.length;i++)
       {
           System.out.print(even[i]+" ");
       }
       System.out.println();
        for(i=0;i<odd.length;i++)
       {
           System.out.print(odd[i]+" ");
       }
     
    }
}
