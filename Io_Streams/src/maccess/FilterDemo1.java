package maccess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDemo1 {
	public static void main(String[] args) {
		List<String> ob1=Arrays.asList("Manu","Bhaskar","Raju","Sana","jon","Manohar");
		
		List<String> ob2=new ArrayList<>();
		
//	ob2=ob1.stream().filter(str->str.length()>6&&str.length()<8).collect(Collectors.toList());
//	
//	System.out.println(ob2);
	
	
	ob1.stream().filter(str->str.length()>6&&str.length()<8).forEach(System.out::println);
	ob1.stream().filter(str->str.length()>6&&str.length()<8).forEach(str->System.out.println(str));


	
	}

}
