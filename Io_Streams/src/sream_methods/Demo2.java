package sream_methods;
import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		
		List<Integer> ob=Arrays.asList(2,3,4,5,6,9);

		long n=ob.stream().filter(num->num%2==0).count();
//		System.out.println(n);
		
		
		Optional <Integer> min=ob.stream().min((v1,v2)->{
			return v1.compareTo(v2);
		});       
			
			
		System.out.println(min.get());
		
		
		Optional<Integer> max=ob.stream().max((v1,v2)->{
			return v1.compareTo(v2);
		});
		System.out.println(max);
	}

}
