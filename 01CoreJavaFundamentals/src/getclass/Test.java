package getclass;




class A
{
	static void m1(Object obj)
	{
		String name=obj.getClass().getName();
		
		System.out.println( "name : "+name);
	}
}


class B{}

class C extends B
{
	
}



public class Test 
{
	
	public static void main(String[] args) {
		
		String s1="abc";
		
		Integer ob=50;
		
		Object obj=new Object();
		B b1=new B();
		
		B b2=new B();
		
		
		A.m1(s1);
		
		A.m1(ob);
		A.m1(obj);
		A.m1(b1);
		
		A.m1(b2);
		
		
	}
	

	
	
}



