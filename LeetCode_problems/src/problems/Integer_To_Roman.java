package problems;

import java.util.*;


public class Integer_To_Roman {
	
	public String  Integer_TO_Roman(int num) {
		String [] thousends =new String[] {"","M","MM","MMM"};
		
		String[] hundreads= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		
		String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		
		String[] units= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		
		
		
		
		return thousends[num/1000]+hundreads[num%1000/100]+tens[num%100/10]+tens[num%10];
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer number :");
		int in=sc.nextInt();
		Integer_To_Roman ir=new Integer_To_Roman();
		
	String result=	ir.Integer_TO_Roman(in);
	
	System.out.println("Result :"+result);
		
		
	}

}
