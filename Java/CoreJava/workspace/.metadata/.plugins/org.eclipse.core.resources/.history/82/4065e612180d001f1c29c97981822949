package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LaunchFunction {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(44);
		list.add(8);
		list.add(50);
		
		list.stream()
			.map(i->i*5)
			.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		Function<Integer,Integer> fun=new Function<>()
				{


					@Override
					public Integer apply(Integer t) {
						// TODO Auto-generated method stub
						return t*5;
					}
			
				};
			list.stream()
			.map(fun)
			.forEach(i->System.out.print(i+" "));				

	}

}
