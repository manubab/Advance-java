package clone;

public class Example2 implements Cloneable
{
	int x=10,y=20;
	
	public Example2 clone()throws CloneNotSupportedException
	{
		return (Example2) super.clone();
		
	}
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Example2 e1=new Example2();
		Example2 e2 =e1.clone();
		
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
