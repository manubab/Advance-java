package maccess;
import java.util.*;
public class Test {
	int rev=0;
	public boolean isPalin(int x) {
		if(x<0||x!=0&&x%10==0) 
			return false;
			while(x>rev) {
				int n=rev*10+x%10;
				rev=rev+10*(n*n*n);
				
				x=x/10;
			
		}
		return(x==rev||x==x/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your x value :");
		int x=sc.nextInt();
		Test t=new Test();
		boolean b=t.isPalin(x);
		System.out.println(b);
	}

}
