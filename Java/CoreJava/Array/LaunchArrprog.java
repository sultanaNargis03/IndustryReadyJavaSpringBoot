
public class LaunchArrprog 
{

	public static void main(String[] args) 
	{
		int ar[]= {2,5,3,4,6,1};
		
//		int max=ar[0];
//		for(int i=0;i<ar.length;i++)
//		{
//			if(ar[i]>max)
//			{
//				max=ar[i];
//				
//			}
//		}
//		System.out.println("The max value in an array is :"+ max);
		
		int min=ar[0];
		int index =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
				index=i;
				
			}
		}
		System.out.println("The min value in an array is :"+ min + " found at index "+ index);

	}

}
