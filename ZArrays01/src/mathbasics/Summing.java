package mathbasics;

import java.util.*;

public class Summing {

	static int sum = 0;

	public static int summing(int n) {
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter the number :");
		 * 
		 * int n = sc.nextInt(); int sum = summing(n);
		 * 
		 * System.out.println(sum);
		 */

		/*
		 * System.out.println("Enter the string number :");
		 * 
		 * String val = sc.nextLine();
		 * 
		 * 
		 * int sum=summing(val);
		 * 
		 * 
		 * System.out.println(sum);
		 */
		/*
		 * System.out.println("Enter the value :"); int a=sc.nextInt();
		 * System.out.println("Enter the value :"); int b=sc.nextInt();
		 * System.out.println("Enter the value "); int c=sc.nextInt();
		 * 
		 * boolean flag= validate(a,b,c);
		 * 
		 * if(flag==true) { System.out.println("Valid triangle"); } else {
		 * System.out.println("invalid triangle"); }
		 * 
		 */

		/*
		 * System.out.
		 * println("=======================power calculations================");
		 * 
		 * System.out.println("Enter the x value :"); int x=sc.nextInt();
		 * System.out.println("Enter the y value :"); int y=sc.nextInt();
		 * 
		 * Double power=Math.pow(x, y);
		 * 
		 * System.out.println("Power value :"+power);
		 * 
		 */
		
		
		
		
		/*
		 * System.out.
		 * println("=======================power calculations================");
		 * 
		 * System.out.println("Enter the x value :"); int x=sc.nextInt();
		 * System.out.println("Enter the y value :"); int y=sc.nextInt();
		 * 
		 * // Double power=Math.pow(x, y);
		 * 
		 * int power = 1;
		 * 
		 * for (int i = 0; i < y; i++) {
		 * 
		 * power=power*x;
		 * 
		 * }
		 * 
		 * System.out.println(power);
		 * 
		 */
		
		
		
		
		System.out.println("============fabinocci series ==============");
		
		System.out.println("Ente the  n value :");
		
		int n=sc.nextInt();
	
		febinacci(n);
		
		
		
		
		
		
		
		
		
		
		

	}

	
	static int a=1,b=1;
	static int c;
	private static void febinacci(int n) {

	   for(int i=0;i<n;i++)
	   {
		   c=a+b;
		   a=b;
		   b=c;
		   
		   System.out.println(b);
		   
		   
		   
	   }
	   
	   
	   System.out.println(Integer.MAX_VALUE);
	   
	   System.out.println(Integer.MIN_VALUE);
	   System.out.println(Integer.reverse(123));
	   
	}

	private static boolean validate(int a, int b, int c) {

		if (a + b > c && b + c > a && c + a > b) {
			return true;
		}
		return false;
	}

	private static int summing(String val) {

		char[] crr = val.toCharArray();
		int sum = 0;
		for (int i = 0; i < crr.length; i++) {
			sum = sum + crr[i] - '0';
		}
		return sum;
	}

}
