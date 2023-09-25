package test;
import java.util.*;

interface A{
	void m1();
}
 abstract class B{
	 abstract void m2();

	
}
public class Anonymoues_Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		A a=new A() {

			@Override
			public void m1() {
				System.out.println(" value : "+n);
				
			}
			
		};
		a.m1();
		
		B b=new B() {

			@Override
			void m2() {
				System.out.println(" value :"+ n);
				
			}
			
		};
		b.m2();
		
		
	}

}
