
public class LaunchAr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]=new int[4];
		
		ar[0]=10;
		ar[1]=20;
		//ar[2]=30.5;
		System.out.println(ar.getClass().getName());
		
		//ar[3]=40; arrays in java guarded with boundaries so 
		//we cannot go beyound the size of an array we have asked ofr
		
		System.out.println("Within boundary");
	}

}
