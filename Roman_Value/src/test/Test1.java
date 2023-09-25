package test;

import java.util.*;

public class Test1 {
	
	public String Roman(int a) {
		
		String[] thousends =new String[] {"","M","MM","MMM"};
		
		String[] hundreads= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM",};
		
		String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXXX","XC"};
		
		String[] digits= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		
		
		return thousends[a/1000]+
				
				hundreads[(a%1000)/100]+
				
				tens[(a%100)/10]+
				
				digits[a%10];
	
			
		
		
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integer value :");
		int n=sc.nextInt();
		
		Test1 t=new Test1();
		
	String s=t.Roman(n);
		System.out.println("Roman Number :"+s);
	}

}
