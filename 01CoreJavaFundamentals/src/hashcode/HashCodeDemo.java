package hashcode;

class Example{}

public class HashCodeDemo 
{
	public static void main(String[] args) {
		
		Example e1=new Example();
		Example e2=new Example();
	
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		System.out.println(" ");
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()==e2.hashCode());
		
		
		
	}
	

}
