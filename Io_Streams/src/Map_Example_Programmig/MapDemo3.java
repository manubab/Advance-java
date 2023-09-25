package Map_Example_Programmig;
import java.util.*;
import java.util.stream.*;
public class MapDemo3 {
	public static void main(String[] args) {
		List<Integer> ob1=Arrays.asList(2,3,5,7,10);
		List<Integer> ob2=new ArrayList<>();
		
		//  without map
//		for(int i:ob1)
//		{
//			System.out.println(i*3);
//		}
		
		
		ob2=ob1.stream().map(e->e*3).collect(Collectors.toList());
		System.out.println(ob2);
		
		
		
		
		
	}

}
