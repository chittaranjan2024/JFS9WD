package codekata;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
	
		//Scanner obj = new Scanner(System.in);
        String userInput = "I am john cena cena john";
        
        String array[]=userInput.split(" ");
        List<String> list=new ArrayList<String>();
        
        for(int i=0;i<array.length;i++)
        {
          
        	list.add(array[i]);
        	
        }
        
        
        

	}

}
