package clone;

class A1
{
	int p=5;
	
}
class B extends A1
{
	int q=6;
}

class C extends B 
{
	int r=7;
}
public class D extends C implements Cloneable
{
	
	int s=8;
	
	
	public String toString()
	{
		return  "p :"+p+"\n"+
	            "q :"+q+"\n"+
				"r :"+r+"\n"+
	            "s :"+s;
	
				
	}
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		D d1=new D();
		D d2=(D) d1.clone();
		
		
		System.out.println("data :"+d1);
		System.out.println( "data :"+d2);
		
		
		d2.p=12;d2.q=13;
		d2.r=14;d2.s=15;
		
		
		System.out.println();
		
		System.out.println("data :"+d1);
		System.out.println( "data :"+d2);
		
	}
}


