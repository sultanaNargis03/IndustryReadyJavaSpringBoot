
public class LaunchStr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuffer  str="Java";//invalid
		
//		StringBuffer str=new StringBuffer("Java");
//		System.out.println(str);
//		StringBuffer str=new StringBuffer("Java");
//		
//		System.out.println(str.capacity());//16 + 4
//		
//		System.out.println("********************************************");
//		
//		StringBuilder str1=new StringBuilder("Java");
//		System.out.println(str1);
//		StringBuilder str1=new StringBuilder("Java");
//		
//		System.out.println(str1.capacity());//16 + 4
		
//		StringBuffer s1=new StringBuffer();//16
		StringBuilder s1=new StringBuilder();//16
		s1.append("Java"); //16-4=12
		s1.append(" is the best");//12-12=0
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.append(" and");// 16 + 4=20
		System.out.println(s1);
		System.out.println(s1.capacity());// old capacity * 2 + 2 ==> 16 *2=32+ 2= 34
		
		
		
		
		
		
		
		
		
		

	}

}
