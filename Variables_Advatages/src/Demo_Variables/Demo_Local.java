package Demo_Variables;
import java.util.*;
public class Demo_Local {
	
	public void mySchool()
	{
		String schoolName;
		
	//	System.out.println(schoolName);//    Local variables must be intialise                   
	}
	
	
	
	
	
}
 
class Student{
	 Student()
	 {
		 String nCollege="PIET";
		 System.out.println("Name of the collage :"+nCollege);
	 }
	 
	 void subMarks()
	 {
		 int cMarks=89;
		 int pMarks=67;
		 int mMarks=97;
		 
		 int totalMarks=cMarks+pMarks+mMarks;
		 
		 System.out.println("totalMarks :"+totalMarks);
	 }
	 
	 public static void main(String []args)
	 {
		 Student ob=new Student();
		 
		// System.out.println("Name of the Collage :"+nCollage);// local variable can not come to out Side 
		 
		 ob.subMarks();
		 
		 //  System.out.println("Total Marks :"+totalMarks); //compailer time error 
		 
	 }
	 
 }

class Test
{
	
	void m1()
	{
	//	public int x=10;  we cannot declare with access modifier 
	}
	
}



 
 
