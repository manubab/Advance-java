package com.manu.sw;
import java.util.*;

public class ArraySoting_Class {
		public void m1() {
	
		Integer[] arr= {10,4,12,13,9,15};
		Arrays.sort(arr);
		String [] s= {"manu","madhu","bhaskar,amma,nanna"};
	     
		 Arrays.sort(s);	

		for(int a:arr) {
			System.out.print(a+"\t \n");
		}
		for(String s1:s) {
			System.out.print(s1+"\t");
		}
		
		
		

	}
	public static void main(String[] args) {
		ArraySoting_Class t1=new ArraySoting_Class();
		t1.m1();
	}
	

}
