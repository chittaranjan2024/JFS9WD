package sorting;

public class MergeSort {
	
 static void merge(int arr[],int l,int m,int r)
 {
	 int n1=m-l+1;
	 int n2=r-m;
	 
	 
	 int L[]=new int[n1];
	 int R[]=new int[n2];
	 
	 for(int i=0;i<n1;i++)
		 L[i]=arr[l+i];
	 for(int j=0;j<n2;j++)
		 R[j]=arr[m+1+j];
	 
	 
	 int i=0,j=0;
	 
	 int k=l;
	 
	 while(i<n1 && j<n2)
	 {
		 if(L[i]<=R[j])
		 {	 arr[k]=L[i];
		 	 i++;
		 }
		 else
		 {
			 arr[k]=R[j];
			 j++;
		 }
		 k++;
	 }
	 
	 
	 for(;i<n1;i++,k++)
	 {
		 arr[k]=L[i];
	 }
	 
	 for(;j<n2;j++,k++)
	 {
		 arr[k]=R[j];
	 }
	 	 
 }
 
 
 static void mergeSort(int arr[],int l,int r)
 {
	 if(l<r)
	 {
		 int m=l+(r-l)/2;
		 mergeSort(arr, l, m);
		 mergeSort(arr, m+1, r);
		 
		 merge(arr,l,m,r);
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
		
		mergeSort(ar,0,ar.length-1);
		
		
		System.out.println("after sorting..");
		display(ar, ar.length);

	}

}
