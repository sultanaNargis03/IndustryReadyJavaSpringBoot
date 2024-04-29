package sorting;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int arr[]= {5,2,9,8,3,7};
		int minIndex;
		int temp;
		System.out.println("before sorting");

		for(int num:arr)
			System.out.print(num+" ");
		
		for(int i=0;i<arr.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
			//to print each iteration
//			System.out.println();
//			for(int num:arr)
//				System.out.print(num+" ");
		}

		System.out.println("\nAfter sorting");
		
		for(int num:arr)
			System.out.print(num+" ");
	}

}