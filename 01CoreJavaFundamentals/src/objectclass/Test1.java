package objectclass;

class Address{}
class Student
{
	
	private int sno;
	private String sname;
	private int whichClass;
	
	
	public Student(int sno,String sname,int whichClass)
	{
		this.sno=sno;
		this.sname=sname;
		this.whichClass=whichClass;
	}
	
	public boolean equals(Object ob)
	{
		if(this==ob)
		{
			return true;	
		}
		else
		{
			if(ob instanceof Student)
			{
				Student s=(Student) ob;
				
				
				return this.sno==s.sno&&
						this.sname.equals(s.sname)&&
				this.whichClass==s.whichClass;			
			}
			else
			{
				return false;
			}
		}
		
	}

}


public class Test1
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1, "Hari", 12);
		Student s2=new Student(2, "Krishna",12);
		Student s3=new Student(1, "Hari", 12);
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		
		
		Student s4=s2;
		System.out.println();

		System.out.println(s4==s2);
		
	}
	
}

