package clone;

class Address1 implements Cloneable {
	int flatNo = 1;
	String colony = "Ameerpet";
	String city = "HYD";

	public Address1 clone() throws CloneNotSupportedException {

		return (Address1) super.clone();
	}
	 
	
}

public class DeepCloneaning implements Cloneable {

	int sno = 1;
	String sname = "StudentOne";
	String course = "Course1";
	double fee = 1000;
	Address1 add = new Address1();

	public DeepCloneaning clone() throws CloneNotSupportedException {

		DeepCloneaning ds = (DeepCloneaning) super.clone();
		
		ds.add=this.add.clone();
		
		return ds;
		
		
	}
	
	public static void main(String[] args)throws CloneNotSupportedException
	{
		DeepCloneaning ds1=new DeepCloneaning();
		DeepCloneaning ds2=ds1.clone();
		
		System.out.println(ds1.add==ds2.add);	}
	
	

}
