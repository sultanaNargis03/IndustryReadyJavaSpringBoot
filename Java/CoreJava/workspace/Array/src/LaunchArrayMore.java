import java.util.Arrays;

public class LaunchArrayMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Telusko();
		
		int ar[]=new int[4];
		
		System.out.println(ar.getClass().getName());// [I
		
		int arr[][]=new int[4][2];
		
		System.out.println(arr.getClass().getName());//[[I
		
		int a[]= {8,4,2,6};
		
		for(int unsorted:a)
		{
			System.out.print(unsorted + " ");
		}
		System.out.println();
		
		Arrays.sort(a);// static methods of Arrays class can be used on data in an array object
		
		for(int sorted:a)
		{
			System.out.print(sorted + " ");
		}
		
		
//		String str="Telusko";
//		str.toUpperCase();

	}

}
