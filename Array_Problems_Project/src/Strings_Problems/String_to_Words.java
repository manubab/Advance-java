package Strings_Problems;

import java.util.StringTokenizer;

public class String_to_Words {

	public static void main(String[] args) {
		String s="i am a Coder";
		int count=0;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			count++;
			
	
		}
		System.out.println("Count of Tokens :"+count);

	}

}
