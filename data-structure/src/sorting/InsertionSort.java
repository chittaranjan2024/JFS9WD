package sorting;

public class InsertionSort {

	static void insertionSort(int arr[],int size)
	{
		for(int i=1;i<size;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			//moving elements of arr that are greater than key, one position ahead of
			//their current position
			for(;j>=0 && arr[j]>key;j=j-1)
			{
				arr[j+1]=arr[j];
				
			}
			arr[j+1]=key;
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
		insertionSort(arr, length);
		display(arr, length);

	}

}
