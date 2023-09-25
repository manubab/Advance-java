package test;

import test.C.Sub1;

class C{
	public int a=120;
	public static int b=140;
	public void m1() {
		System.out.println("**** Class C m1() *****");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}
	public static class Sub1{
		public int c=10;
		public static int d=20;
		
		public static void m2() {
			System.out.println("**** Class Sub1 m2() ****");
			//System.out.println("The value a:"+a);
			
			class Sub2{
				int x=12;
				static int y=14;
				
				void m3() {
			//		System.out.println("a :"+a);
					System.out.println("x :"+x);
					System.out.println("y "+y);
				//	System.out.println("c :"+c);
					System.out.println("d :"+d);
					System.out.println("b :"+b);
				}
			}
			Sub2 s=new Sub2();
			s.m3();
		}
		
		
	}

	
}

public class Main {
	public static void main(String[] args) {
		C.Sub1 ob=new C.Sub1();
		Sub1.m2();
		C c=new C();
		
	}

}
