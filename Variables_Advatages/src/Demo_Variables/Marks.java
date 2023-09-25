package Demo_Variables;
 
// inside the class out side th method

// they are avilable for entire methods because it is not declare with static key words  

class Demo_Instance_Varable {                                                        
	
	int a=30;
	int b=40;
	
	public static void main(String[] args) {
	
		// this area is called static area 
		
		Demo_Instance_Varable ob=new Demo_Instance_Varable();
		
		System.out.println(ob.a);
		
		ob.m1();
		
	}
	
	
	void m1() // this method instance area 
	{
		System.out.println(a);
		System.out.println(b);
	}
	

}




public class Marks
{
	int phyMarks=80;
	
	public static void main(String[] args) {
		
		Marks ob1=new Marks();
		Marks ob2=new Marks();
		
		int pMarks1=ob1.phyMarks;
		int pMarks2=ob2.phyMarks;
		
		System.out.println("Marks in Physics :"+pMarks1);
		System.out.println("Marks in Physics :"+pMarks2);

		ob2.phyMarks=90; // Changing the value 
		
		// after changing
		
		
		System.out.println("Marks in Physics :"+ob1.phyMarks);
		System.out.println("Marks in Physics :"+ob2.phyMarks);
	}
	
}






















































