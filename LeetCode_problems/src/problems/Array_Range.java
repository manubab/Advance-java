package problems;

import java.util.Arrays;

public class Array_Range{

	public static void main(String[] args) {
		
		int [] arr= {2,4,1,6,7,10};
		
		Arrays.sort(arr);
		int len=arr.length;
		int l=arr[0];
		int h=arr[len-1];
		
		int range=h-l;
		
		System.out.println(range);
		

		
	}

}
