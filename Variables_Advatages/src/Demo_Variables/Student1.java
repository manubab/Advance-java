package Demo_Variables;

// inside the class outside the any methods constuctors or blocks;

 class Demo_Static_Varables {
	
	static int a=400;
	static int b=500;
	
	public static void main(String[] args) {
		System.out.println(Demo_Static_Varables.a);
		System.out.println(Demo_Static_Varables.b);
		
		
		Demo_Static_Varables ob=new Demo_Static_Varables();
		
		ob.m1();

	}

	 void m1() {
		 System.out.println(Demo_Static_Varables.a);
		 System.out.println(Demo_Static_Varables.b);
	}
	
	
	
	

}

public class  Student1
{
	static String collageName="PIET";
	
	public static void main(String[] args) {
		System.out.println(collageName);
		
		// changing value 
		
		collageName="Sgit";
		System.out.println(collageName);
	}
}




















































































































