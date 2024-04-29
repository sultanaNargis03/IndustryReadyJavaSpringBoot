package searching;

public class LaunchSearching {

	public static void main(String[] args) 
	{
		//int arr[]= {10,20,30,40,50,60,70,80,90,100,150};
		int arr[]=new int[10000];
		int target=100;
		int left=0;
		int right=arr.length-1;
		
		int result1=binarySearch(arr,target,left,right);
		int result2=linearSearch(arr,target);
		if(result1!=-1)
			System.out.println(target+" found at index : "+result1);
		else
			System.out.println(target+" not found");
		if(result2!=-1)
			System.out.println(target+" found at index : "+result2);
		else
			System.out.println(target+" not found");

	}
	

	public static int linearSearch(int[] arr, int target) {
		int step=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			step++;
			if(arr[i]==target) {
				
				System.out.println("steps taken by linear "+step);
				return i;
			}
		}
		System.out.println("steps taken by linear "+step);
		return -1;
	}


	public static int binarySearch(int[] arr, int target, int left, int right)
	{
		int step=0;
		
//		if(left<=right)
//		{
//			
//			int mid=(left+right)/2;
//			
//			if(arr[mid]==target)
//			{
//				
//				
//				return mid;
//			}	
//			else if(arr[mid]<target)
//			{
//				return binarySearch(arr,target,mid+1,right);
//				
//			}
//			else if(arr[mid]>target)
//			{
//				return binarySearch(arr,target,left,mid-1);
//			}
//		}
		
		while(left<=right)
		{
			step++;
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				System.out.println("steps taken by binary "+step);
				return mid;
			}	
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else if(arr[mid]>target)
			{
				right=mid-1;
			}
		}
		System.out.println("steps taken by binary "+step);
		return -1;
	}

}
