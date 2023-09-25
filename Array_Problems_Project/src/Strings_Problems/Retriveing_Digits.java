package Strings_Problems;
public class Retriveing_Digits {
	public static void main(String[] args) {
	String s="i am manohar 1  i am doing 10 Coding challenges";
	String ns="";
	
	
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				
			ns=ns+c;
			}else
				System.out.println(ns);
			ns="";
		}
		
	}

}
