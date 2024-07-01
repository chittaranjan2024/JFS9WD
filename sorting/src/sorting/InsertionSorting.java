package sorting;

public class InsertionSorting {
	
	static void sort(int ar[],int size)
	{
		int i,j;
		for(i=1;i<size;i++)
		{
			int key=ar[i];
			
			for( j=i-1;j>=0 && ar[j]>key;j=j-1)
			{
				ar[j+1]=ar[j];
			}
			
			ar[j+1]=key;
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
