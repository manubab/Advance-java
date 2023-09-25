package sream_methods;
import java.util.*;
import java.util.stream.Collectors;
public class Demo5 {
	public static void main(String[] args) {                                            
		List<Integer> ob= Arrays.asList(1,3,2,6,4,9,10);
		
		List<Integer>ob1=ob.stream().sorted().collect(Collectors.toList());
		System.out.println(ob1);
		
		List<Integer> ob2=ob.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ob2);
	}

}
