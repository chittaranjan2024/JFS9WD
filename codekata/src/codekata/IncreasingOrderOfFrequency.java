package codekata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Ele
{
	int count,index, val;
}

//for sorting by the value 
class SortByValue implements Comparator<Ele>
{

	@Override
	public int compare(Ele o1, Ele o2) {
		
		return (o1.val-o2.val);
	}
	
}
//for sorting by the frequency. In frequency is same for two or more element then consider the index  
class SortByFrequency implements Comparator<Ele>
{

	@Override
	public int compare(Ele o1, Ele o2) {
		if(o1.count!=o2.count)
		{
			return (o1.count-o2.count);
		}
		return (o1.index-o2.index);
	}
}	




public class IncreasingOrderOfFrequency {
	
	static void sortElements(int arr[],int n)
	{
		ArrayList<Ele> arrayList=new ArrayList<Ele>();
		
		for(int i=0;i<n;i++)
		{
			arrayList.add(new Ele());
			arrayList.get(i).index=i;
			arrayList.get(i).count=0;
			arrayList.get(i).val=arr[i];
		}
		
		
		Collections.sort(arrayList,new SortByValue());
		arrayList.get(0).count=1;//count of first element as 1
		
		//counting the occurrences of the remaining elements
		for(int i=1;i<n;i++)
		{
			if(arrayList.get(i).val==arrayList.get(i-1).val)
			{
				arrayList.get(i).count+=arrayList.get(i-1).count+1;
				arrayList.get(i-1).count=-1;
				arrayList.get(i).index=arrayList.get(i-1).index;
				
			}
			else
			{
				arrayList.get(i).count=1;	//if previous element is not equal to the current
			}
		}
		
		
		Collections.sort(arrayList,new SortByFrequency());
		 for(int i=n-1,index=0;i>=0;i--)
		 {
			 if(arrayList.get(i).count!=-1 )
			 {
				 for(int j=0;j<arrayList.get(i).count;j++)
				 {
					 arr[index++]=arrayList.get(i).val;
				 }
			 }
		 }
		
		
		
	}

	public static void main(String[] args) {
		int ar[]= {5,3,2,1,1,4,5,7,9};
		int length=ar.length;
		
		sortElements(ar, length);
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}

	}
}



