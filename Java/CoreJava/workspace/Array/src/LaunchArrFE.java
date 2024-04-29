
public class LaunchArrFE 
{

	public static void main(String[] args) 
	{
		int ar[]= {2,4,6,8,5};
		
//		System.out.println(ar[0]);//2
//		System.out.println(ar[1]);//4
		
//		for(int i=0;i<ar.length ;i++)
//		{
//			System.out.print(ar[i]);
//		}
		
//		for(int elem:ar)
//		{
//			System.out.print(elem + " ");
//		}
		
//		double dar[]= {1.5, 5.5, 3.4, 4.4};
//		double sum=0;
//		for(double realNumber:dar)
//		{
//			sum=sum+realNumber;
//		}
//		
//		System.out.println("The sum of all elem of an array is : "+ sum);
		
		int [][]arr= {{2,4,6,8},{1,3,5,7,9}};
		
		for(int array[]:arr)
		{
			for(int data:array)
			{
				System.out.print( data +"  ");
			}
			System.out.println();
		}
		

	}

}
