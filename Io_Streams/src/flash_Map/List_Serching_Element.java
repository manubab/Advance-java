package flash_Map;

import java.util.*;
import java.util.stream.*;

public class List_Serching_Element {
	
	
	public static int search(String[] arr,String key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		List<String> ob=new ArrayList<String>();
		
		ob.add("Oracle");
		ob.add("Java");
		ob.add("Advance");
		ob.add("Spring");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Serching Element");
		String s=sc.nextLine();
		
		String[] arr =ob.toArray(new String[0]);
		
		System.out.println(s+" is found index of :"+search(arr,s));
		
		
		
		 
		
	}

}
