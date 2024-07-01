package test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int res = 0;
        int multiplier = 1;
        int bit_sum;
        while (true) {
                 
            if(n==0 && m==0)
            break;
 
            // Add each bits
            bit_sum = (n % 10) + (m % 10);
 
            // Neglect carry
            bit_sum %= 10;
 
            // Update result
            res = (bit_sum * multiplier) + res;
            n /= 10;
            m /= 10;
 
            // Update multiplier
            multiplier *= 10;
           
        }
        
        System.out.println(res);
        
        
    }
}