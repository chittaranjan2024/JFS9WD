package sorting;

public class SelectionSort {

	static void selectionSort(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			//finding the minimum element in the unsorted array
			int min_idx=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx=j;
				}
			}
			//swapping minimum element with the first element 
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
					
		}
	}
	
	
	static void display(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int arr[]= {64,34,25,12,22,11,90};
		int length=arr.length;
		display(arr, length);
		selectionSort(arr, length);
		display(arr, length);

	}

}
