package clone;

class A2
{
	
}
class B2{
	
}

class C1{
	A2 a1=new A2();
}

public class D1 extends C1 implements Cloneable
{
	
	B2 b1=new B2();
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		D1 d1=new D1();
		D1 d2=(D1) d1.clone();
		
		
		System.out.println(d1.a1==d2.a1);
		System.out.println(d1.b1==d2.b1);
		
		d1.a1=new A2();
		d1.b1=new B2();
		
		System.out.println(d1.a1==d2.a1);
		System.out.println(d1.b1==d2.b1);
	}

}



