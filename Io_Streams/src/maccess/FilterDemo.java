package maccess;
import java.util.stream.*;
import java.util.*;
import java.util.Arrays;
public class FilterDemo {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayList<Integer> ob1=new ArrayList<Integer>();
		ob1.add(new Integer(12));
		ob1.add(new Integer(32));
		ob1.add(new Integer(43));
		ob1.add(new Integer(21));
		ob1.add(new Integer(16));
		
		
		
		List<Integer> ob2=Arrays.asList(10,22,13,43,56);
		
		List<Integer> ob3=new ArrayList<>();

		// with out using streams;
		
		
//		for(int n:ob2)
//		{
//			if(n%2==0)
//			{
//				ob3.add(n);
//			}
//			
//		}
//		System.out.println(ob3);
		
		// with streams 
		
		
	ob2=ob2.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(ob2);
		
		
		
		
		
//	ob2.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	
		ob2.stream().filter(n->n%2==0).forEach(System.out::println);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}	

}
