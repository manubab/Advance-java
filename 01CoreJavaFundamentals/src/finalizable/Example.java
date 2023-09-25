package finalizable;

public class Example
{
	int x;
	static Example e;
	
	Example(int x)
	{
		this.x=x;
	}
	
	
	public void finalize()
	{
		System.out.println("in finalize ");
		e=this;
	}
	
	public static void main(String[] args) throws Exception 
	{
		Example e1=new Example(10);
		
		e1=null;
		
		System.gc();
		
		Thread.sleep(1000);
		
	}
	
	
	

}





