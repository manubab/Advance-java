package Strings_Problems;

public class Count_Vowels {

	public static void main(String[] args) {
		String s="i am a coder 2 i done my work";
		String ns="";
		int count=0,ncount=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			c=Character.toUpperCase(c);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			}
			
		}
		System.out.println("Count of Vowels: "+count);
		
		for(int i=0;i<s.length();i++)
		{
			if(i==48&&i<=57)
			s.charAt(i);
			ncount++;
			
		}
		
		

	}

}
