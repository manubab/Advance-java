package sream_methods;
import java.util.*;
public class demo4 {
	public static void main(String[] args) {
	      List<String> ob=Arrays.asList("a","b","c","1","2","3");
	      Object[] arr=ob.stream().toArray();
	      
	      System.out.println(arr.length);
	      
	      
	      for(Object v:arr)
	      {
	    	  System.out.println(v);
	      }
	}

}
