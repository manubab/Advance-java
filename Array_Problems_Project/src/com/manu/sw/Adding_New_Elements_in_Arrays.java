package com.manu.sw;
import java.util.*;
public class Adding_New_Elements_in_Arrays {
	public static void m1() {
		Integer[] arr= {10,12,42,15,15,90};
		List<Integer> ob=Arrays.asList(arr);
		List<Integer> ob1=new ArrayList<>(ob);
		ob1.add(2, 1000);
		
		ob1.replaceAll((k)->k+10);
		ob1.remove(3);
		System.out.println(ob1);
		
		
		String[] s1= {"manu","amma","nanna",};
		List<String> ob2=Arrays.asList(s1);
		List<String> ob3=new ArrayList<String>(ob2);
		ob3.add(0,"Babai ");
		ob3.add("manu");
		System.out.println(ob3);
		
		Set<String> ob4=new HashSet<String>(ob3);
		System.out.println(ob4);
		
		
		
	}
	public static void main(String[] args) {
		m1();
		
	}

}
