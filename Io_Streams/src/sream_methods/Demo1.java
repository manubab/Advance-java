package sream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  distrinct()     limit()  
//    count()   


public class Demo1 {
	public static void main(String[] args) {
		
		List<String> ob=Arrays.asList("bus","Car","bus","bycle","car","Car","bike");
		
//		List<String> nob=ob.stream().distinct().collect(Collectors.toList());
		
//		System.out.println(nob);
		
		
		long count=ob.stream().distinct().count();
		
		System.out.println(count);  
		
		ob.stream().distinct().forEach(value->System.out.println(value));
		
	List<String>o=ob.stream().limit(4).collect(Collectors.toList());
		
		System.out.println(o);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
