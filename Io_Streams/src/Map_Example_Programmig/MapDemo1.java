package Map_Example_Programmig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 */

public class MapDemo1 {
	public static void main(String[] args) {
		List<String> ob1=Arrays.asList("manu","Raju","don","mahesh");
		List<String> ob2=new ArrayList<>();
		
//		with out map;
//		for(String s:ob1)
//		{
//			ob2.add(s.toUpperCase());
//		
//		}
//		System.out.println(ob2);
		
		
		
		
	ob2=ob1.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(ob2);
	}
	

}
