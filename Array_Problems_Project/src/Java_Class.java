


class A{
	void m1() {
		System.out.println("Class A");
	}
}
class B{
	private static A a;
	static {
		a=new A();
	}
	private B() {
		System.out.println("private con ...!");
		
	}
	public static void m2() {
		System.out.println("Class B ");
		B b=new B();
	}
	
}


public class Java_Class {
	
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	

}
