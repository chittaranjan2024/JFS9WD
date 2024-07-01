package sorting;

public class SelectionSorting {

	static void sort(int arr[],int size)
	{
		for(int i=0;i<size-1;i++)
		{
			int min_indx=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[min_indx])
				{
					min_indx=j;
				}
			}
			
			
			int temp=arr[min_indx];
			arr[min_indx]=arr[i];
			arr[i]=temp;
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
