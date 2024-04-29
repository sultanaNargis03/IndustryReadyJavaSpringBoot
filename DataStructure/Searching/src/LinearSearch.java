

import java.util.ArrayList;
import java.util.ListIterator;

public class LinearSearch {

	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		Integer target=180;
		
		list.add(10);
		list.add(30);
		list.add(57);
		list.add(100);
		list.add(140);
		list.add(160);
		list.add(180);
		
		
		ListIterator litr=list.listIterator();
		boolean flag=false;
		while(litr.hasNext())
		{
			Object listValue=litr.next();
			if(listValue.equals(target))
			{
				flag=true;
				break;
				
			}
		}
		if(flag==true)
			System.out.println(target+" found at "+litr.previousIndex());
		else
			System.out.println("404");

	}

}