package Strings_Problems;

public class Swap_String_l_u_OR_u_l {
	public static void main(String[] args) {
		String s="jocker Manu Coder King";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(Character.isUpperCase(c))
				ns=ns+Character.toLowerCase(c);
			else if(Character.isLowerCase(c))
				ns=ns+Character.toUpperCase(c);
			else
			   ns=ns+c;
			
		}
		System.out.println(ns);
	}

}
