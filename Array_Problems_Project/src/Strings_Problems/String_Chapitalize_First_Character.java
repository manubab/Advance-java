package Strings_Problems;
import java.util.*;
public class String_Chapitalize_First_Character {

	public static void main(String[] args) {
		String s="i am manohar";
		s=s+"";
		String word="";
		String s1="";
		int end=0,position=0;
		while(s.indexOf(' ',position)>0)
		{
			end=s.indexOf(' ',position);
			word=s.substring(position,end);
			s1=s1+Character.toUpperCase(word.charAt(0));
			s1=s1+word.substring(1)+" ";
			position=end+1;
			
			
		};
		System.out.println(s1.trim());

	}

}
