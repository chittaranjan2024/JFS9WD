package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
    	Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int ar[]=new int[n];
        int unq[] = null;
       
        
        for(int i=0;i<n;i++)
        {
            ar[i]=obj.nextInt();
   
        }
        
        Arrays.sort(ar);
        int[] unique = Arrays.stream(ar).distinct().toArray();
        int freq[]=new int[unique.length];
        
        for(int i=0;i<n;i++)
        {
        	int key=ar[i],count=1;
            for(int j=i+1;j<n;j++)
            {
            	if(key==ar[j])
            	{
            		count++;
            	}
            }
            freq[i]=count;
   
        }
       
     
        
        
    }
    
  
}