package sorting;

public class BubbleSort {

	public static void main(String[] args) 
	{
		
		int arr[]= {5,2,9,8,3,7};
		int temp;
		System.out.println("before sorting");

		for(int num:arr)
			System.out.print(num+" ");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}					
			}
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