package clone;


class Address
{
	int flatNo=1;
	String colony="Ammerpet";
	String city="Hyd";
}




public class shallowCloaning implements Cloneable
{
	int sno=1;
	String sname="StudentOne";
	String course="Course1";
    double fee=1000;
    Address add=new Address();
    
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	
    	shallowCloaning  c1=new shallowCloaning();
    	shallowCloaning  c2=(shallowCloaning) c1.clone();
    	
    	
    	System.out.println(c1.add==c2.add);
	}
	
}




