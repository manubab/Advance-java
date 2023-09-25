package interview;

public class Ordered {
	String value="t";
	{
		value+="a";
		
	}
	{
		value+="c";
	}
	public Ordered()
	{
		value+="b";
	}
	
	public Ordered(String s)
	{
		value+=s;
	}
	public static void main(String[] args) {
		Ordered ob=new Ordered("f");
		 ob =new Ordered();
		 
		 System.out.println(ob.value);
		
	}

}
