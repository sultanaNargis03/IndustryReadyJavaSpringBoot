
public class LaunchStr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuffer st1=new StringBuffer("Java");
//		StringBuffer st2=new StringBuffer("Java");
		StringBuilder st1=new StringBuilder("Java");
		StringBuilder st2=new StringBuilder("Java");
		
		System.out.println(st1==st2);//false
		
		System.out.println(st1.equals(st2));//false
		
		st1.ensureCapacity(100);
		System.out.println(st1.capacity());
		
		st1.trimToSize();
		System.out.println(st1.capacity());
		
		
		
		
		
		
		

	}

}
