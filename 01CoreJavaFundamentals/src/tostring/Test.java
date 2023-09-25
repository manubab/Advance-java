package tostring;

class A
{
	int x;
	
	A(int x)
	{
		this.x=x;
	}

	@Override
	public String toString() {
		return "" + x ;
	}
	
	
	
	
}

public class Test
{
	public static void main(String[] args) {
		
		A a1=new A(5);
		A a2=new A(6);
		
		System.out.println(a1);
		System.out.println(a2);
		
	}

}





