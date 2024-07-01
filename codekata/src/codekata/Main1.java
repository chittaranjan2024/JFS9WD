package codekata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
   
        //Scanner obj = new Scanner(System.in);
        String userInput = "I am john cena cena john";
        
        String array[]=userInput.split(" ");
        
        ArrayList<String> words=new ArrayList<String>(Arrays.asList(array));
        ArrayList<String> copy=words;
        
        
        for(int i=0;i<words.size()-1;i++)
        {
        	for(int j=i;j<words.size()-1;j++)
        	{	
	        	if(words.get(j).equals(words.get(j+1)))
	        	{
	        		
	        		copy.removeAll(Arrays.asList(words.get(j),words.get(j+1)));
	        		
	        		//System.out.println(copy);
	        		
	        	}
        	}
        }
        
        System.out.println(words);
        System.out.println(copy);
        

        for(int i=0;i<words.size();i++)
        {
        	if(i==0)
        	{
        		System.out.println(words.get(i));
        	}
        	else 
        	{
        		System.out.println(" " + words.get(i));
        	}
        }
        
    }
}