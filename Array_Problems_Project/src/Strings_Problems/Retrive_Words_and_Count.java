package Strings_Problems;
import java.util.*;
public class Retrive_Words_and_Count {
	public static void main(String[] args) {
		
		String s="i am coder i am a dancer i am a Software Engineer";
		
		String [] arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			int  count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count=count+1;
					arr[j]="0";
					
					
				}
			}
			
			if(arr[i]!="0")
			{
				System.out.println(arr[i]+"\t"+count);
			}
				
		}
		
		
		
		
		
	}    
	/// Second Modal I am not return currect main in Second Case
           public static void mai(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		String[] arr=s.split(" ");
		
		for(String ns:arr)
		{
			Integer old=map.get(ns);
			
			if(old==null) {
				old=0;
			}
			map.put(ns, old+1);

		}
			System.out.println(map);

	}

	

}
