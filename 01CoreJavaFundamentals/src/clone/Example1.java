package clone;

public class Example1 implements Cloneable
{
	int x=10;
	int y=20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Example1 ob=new Example1();
		
		Example1 ob1=(Example1) ob.clone();
		
		System.out.println(ob);
		System.out.println(ob1);
		
		
	}

}
