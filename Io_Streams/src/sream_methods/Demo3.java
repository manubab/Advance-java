package sream_methods;
import java.util.*;
import java.util.Arrays;
public class Demo3 {

	public static void main(String[] args) {
        List<String> ob=Arrays.asList("A","B","C","1","2","3");
        Optional<String> r=ob.stream().reduce((v,cv)->{
        	return cv+v;
        });
        System.out.println(r.get());
        
	}

}
