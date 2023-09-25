package flash_Map;
import java.util.*;
import java.util.stream.Collectors;
public class demo2 {
	public static void main(String[] args) {
		List<String> ob1=Arrays.asList("Scott","David","John");
		List<String> ob2=Arrays.asList("Mary","Luna","Tom");
		List<String> ob3=Arrays.asList("ken","jon","kitty");
		
		
		
		List<List<String>> words =new ArrayList<List<String>>();
		
		words.add(ob1);
		words.add(ob2);
		words.add(ob3);
		
		
//		for(List<String> s:words)
//		{
//			for(String s1:s)
//			{
//				System.out.println(s1);
//			}
//			
//		}
		
		
      List<String> ob4= words.stream().flatMap(e->e.stream()).collect(Collectors.toList());
      
      System.out.println(ob4);
      
               
		
		
		
		
	}

}
