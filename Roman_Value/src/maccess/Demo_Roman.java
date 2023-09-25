package maccess;
import java.util.*;
import test.Test;
public class Demo_Roman {
	public static void main(String[] args) {
		System.out.println("Enter Roman String :");
		Scanner sc=new Scanner(System.in);
		String roman=sc.nextLine().toUpperCase();
		
		
		Test t=new Test();
	int result=	t.Roman(roman);
	System.out.println("The Result :"+result);
		
		

	}

}
