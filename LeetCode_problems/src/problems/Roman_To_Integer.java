package problems;
import java.util.*;

public class Roman_To_Integer {
	
	int romanToInteger(String s) {
		
		Map<Character,Integer>map=new HashMap<>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result=0;
		for(int i=0;i<s.length();i++) {
			if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))) {
				result+=map.get(s.charAt(i))-2*map.get(s.charAt(i-1));	
			}else {
				result+=map.get(s.charAt(i));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roman Number");
		String roman=sc.nextLine().toUpperCase();
		Roman_To_Integer rn=new Roman_To_Integer();
	     int r=	rn.romanToInteger(roman);
		System.out.println("Integer_Number :"+r);
	}
}
