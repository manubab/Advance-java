package strings_java_class;
import java.util.*;
public class String2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		
		for(int i=0;i<=s.length()-1;i++) {
			if(i%2==0) {
				char c=s.charAt(i);
				System.out.print(c);
				
			}
		}
				
	}

}
