package Strings_Problems;

public class String_Integer_adding_Numarics {
	public static void main(String[] args) {
		
		String s="i manu iam23years43old";
	int n=0;
	String ns="";
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(s.charAt(i)))
			{
				ns= ns+s.charAt(i);
			}else {
				if(!ns.equals(""))
				{
					n=n+Integer.parseInt(ns);
					ns="";
				}
			}
		}
		System.out.println(n);
	}

}
