import java.util.Scanner;

public class LaunchAr1 
{

	public static void main(String[] args) 
	{
		int []ar=new int[5];
		//ar[0]=24.5;
		
//		ar[0]=14;
//		ar[1]=16;
//		
//		int size=ar.length;
//		System.out.println(size);
		
		
		// length property we use to get the length of an array in Java. 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length; i++)
		{
			System.out.println("Enter the marks of student : "+ i);
			ar[i]=sc.nextInt();
		}
		System.out.println("The marks of student which stored in an array are: ");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		
		

	}

}
