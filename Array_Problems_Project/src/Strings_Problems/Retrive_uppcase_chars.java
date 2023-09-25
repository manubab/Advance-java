package Strings_Problems;
public class Retrive_uppcase_chars {
	public static void main(String[] args) {
		String s="i am Coder  i am java devoloper And my annual ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				w=w+c;
			}else 
			{
				System.out.print(w);
				w="";
				
			}
		}
		
	}

}
