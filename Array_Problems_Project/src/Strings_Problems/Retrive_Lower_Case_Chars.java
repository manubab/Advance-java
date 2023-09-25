package Strings_Problems;

public class Retrive_Lower_Case_Chars {

	public static void main(String[] args) {
		String s="AM I CODER e else ARE JAVA";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLowerCase(c))
			{
				ns=ns+c;
			}else
			{
				System.out.print(ns);
				ns="";
			}
		}
		
		

	}

}
