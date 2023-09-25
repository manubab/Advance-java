package maccess;
import java.util.*;
public class Power_Bill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units :");
		int u=sc.nextInt();
		System.out.println("Enter Charge :");
		int charge=sc.nextInt();


		
		if(u<=100)
		{
		float amt=u*charge;
			System.out.println("Power bill amt :"+amt);
		}else if(u>=100&&u<=200)
		{
			float amt=u*charge;
			System.out.println(" power bill amt :"+amt);
			
		}else if(u>=200&&u<=300)
		{
			float amt=u*charge;
			System.out.println(" power bill amt :"+amt);

		}
		else 
		{
		   float amt =u*charge;
		   System.out.println("Power bill amt :"+amt);
			
		}
		
	}

}
