package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Launch2 {

	public static void main(String[] args)
	{
		 List<Integer> names = Arrays.asList(1,2,3,5,10,9,8);
		 
		 Integer str = names.stream()
			 .filter(i->i%2==0)
			 .map(i->i*2)
			// .reduce(0,(c,e)->(c+e))
			 .findFirst()
			 .orElse(0);
		 System.out.println(str);
		 
	}

}
