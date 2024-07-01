package test;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
  
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int[] nums = new int[5];
        int i;
 
        // Loop to store input values in nums array
        for (i = 0; i < nums.length; i++) {
            nums[i] = obj.nextInt();
        }
        // Printing stored values
        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
