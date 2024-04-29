import java.util.Scanner;

public class LaunchAr2 
{

	public static void main(String[] args) 
	{
		int [][]ar=new int[3][4];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter the marks of class : "+ i + " Student : "+ j);
				ar[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Marks stored in an array are as follows : ");
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
