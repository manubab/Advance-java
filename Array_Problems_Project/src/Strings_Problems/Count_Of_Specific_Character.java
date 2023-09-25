package Strings_Problems;

public class Count_Of_Specific_Character {

	public static void main(String[] args) {
		String s="revanasura";
		
		String ns="";
		int count1=0;
		int count2=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			c=Character.toUpperCase(c);
			if(c=='R')
				count1++;
			if(c=='A')
				count2++;
		}
		System.out.println("Count of R Character in a String :"+count1);
		System.out.println("Count of R Character in a String :"+count2);



	}

}
