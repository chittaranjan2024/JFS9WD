package sorting;

public class MergeSort {

	//Merge two subarrays of arr[]
	//first subarray is arr[l..m]
	//second  subarray is arr[m+1..r]
	void merge(int arr[],int l,int m,int r)
	{
		//sizes of two subarrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		
		//temporary arrays
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//coping data to the sub arrays
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			R[j]=arr[m+1+j];
		}
		
		//Merge
		//initial index of both subarrays
		int i=0,j=0;
		
		//initial index of the merged subarrys
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
					
		}
		
		//coping remaining elements of L[]
		while(i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		
		//coping remaining elements of R[]
		while(j<n2)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
		
		
	}
	
	void sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			//find the mid position
			int m=l+(r-l)/2; 
			
			//sort first and second half
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}

	}
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {10,7,8,9,1,5};
		int N=arr.length;
		MergeSort obj=new MergeSort();
		obj.sort(arr, 0, N-1);
		display(arr);
	}

}
