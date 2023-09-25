package Strings_Problems;

public class remove_whiteSpace {
   
	public static void main(String[] args)
	{
		String s="i am coder ";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				ns=ns+c;
			
			}
		}
		System.out.println(ns);
		
	}

}
