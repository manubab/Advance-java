package interview;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
public class How_Claculate_Array_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		int size=5;
		
		int[] n=new int[5];
		
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
			
		}
		
	   Arrays.sort(n);
	   
	   int l=n[0];
	   int h=n[n.length-1];
	   
	   
	}

}
