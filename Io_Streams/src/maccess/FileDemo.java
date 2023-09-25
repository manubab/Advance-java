package maccess;
import java.util.*;
import java.util.stream.Collectors;
public class FileDemo {
	public static void main(String[] args) {
		
		 
		List<String> words=Arrays.asList("cup",null,"forest","sky","book","theatre");
		
		List<String> result=new ArrayList<String>();
		
		result=words.stream().filter(w->w!=null).collect(Collectors.toList());

		
		 System.out.println(result);
		 
		 
          		 
		 

	}

}
