package test;

import java.util.Scanner;
public class Main {
    
     public static long nearestPowerOf2(long N)
    {
        long a = (int)(Math.log(N) / Math.log(2));
 
        return (long) Math.pow(2, a + 1);
    }
    
    public static void main(String[] args) {
       
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        
         System.out.println(nearestPowerOf2(n));
    }
}