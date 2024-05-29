package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LaunchConsumer {

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(44);
		list.add(8);
		
		list.forEach(i->System.out.print(i+" "));
		
		Consumer con=new Consumer()
				{
					public void accept(Object i)
					{
						System.out.println(i);
					}
				};
		 list.forEach(con);
				
	}

}
