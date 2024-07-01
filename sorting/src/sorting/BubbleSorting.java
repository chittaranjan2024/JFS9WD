package sorting;

public class BubbleSorting {

	static void sort(int ar[],int size)//4 []
	{
		int i,j,temp;
		boolean swapped;
		
		for(i=0;i<size-1;i++)
		{
			swapped=false;
			for(j=0;j<size-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					swapped=true;
				}
			}
			
			if(swapped==false)
			{
				break;
			}
		}
		
		
	}
	
	static void display(int ar[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int ar[]= {64,33,25,12,22,11,90};
		System.out.println("before sorting..");
		display(ar, ar.length);
		
		sort(ar,ar.length);
		
		
		System.out.println("after sorting..");
		display(ar, ar.length);
		
	}

}
