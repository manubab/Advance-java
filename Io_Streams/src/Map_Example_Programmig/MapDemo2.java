package Map_Example_Programmig;
import java.util.stream.*;
import java.util.*;
public class MapDemo2 {
	public static void main(String[] args) {
		
		List<String> ob1=Arrays.asList("manu","Raju","don","mahesh");
		
		List<Integer> ob2=new ArrayList<>();
		
		// without map
		
//		for(String s:ob1)
//		{
//			ob2.add(s.length());
//		}
//		System.out.println(ob2);
		
		
		//with map
		
		ob2=ob1.stream().map(name->name.length()).collect(Collectors.toList());
		System.out.println(ob2);
		
		
		
	}

}
