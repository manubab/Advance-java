package test;
import java.util.*;

public class Add_2_Binary_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Binary number :");
		String b1=sc.nextLine();
		System.out.print("Enter second Binary number :");
		String b2=sc.nextLine();
		
		int n1=Integer.parseInt(b1, 2);
		int n2=Integer.parseInt(b2, 2);
		int n3=n1+n2;
		
		System.out.println("n1 :"+Integer.toBinaryString(n1));
		System.out.println("n2 :"+Integer.toBinaryString(n2));
		System.out.println("n3=n1+n2 :"+Integer.toBinaryString(n3));


	}

}
