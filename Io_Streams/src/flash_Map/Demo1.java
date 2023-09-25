package flash_Map;
import java.util.*;
import java.util.stream.Collectors;
public class Demo1 {
	public static void main(String[] args) {
		List<Integer> ob1=Arrays.asList(10,12,14,16,18); 
		
	List<Integer>ob2=ob1.stream().map(n->n+10).collect(Collectors.toList());
		//System.out.println(ob2);
		
		
		
		
		List<Integer> lst1=Arrays.asList(1,2);
		List<Integer> lst2=Arrays.asList(3,4);
		List<Integer> lst3=Arrays.asList(5,6);
		
		List<List<Integer>> ob3=Arrays.asList(lst1,lst2,lst3);

		List<Integer> ob4=ob3.stream()
				.flatMap(x->x.stream())
				.collect(Collectors.toList());
		System.out.println(ob4);
		
	}

}
