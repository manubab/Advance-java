package Strings_Problems;
import java.util.*;
public class Retrive_Dublicate_Words_Count_Number_Occurencess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		if (s.trim().length() == 0) {
			System.out.println("Pls Enter valid in String ...!");
		} else
			finddwc(s);
	}
	public static void finddwc(String s) {
		Map<String, Integer> map = new HashMap<>();
		String[] aw = s.split(" ");
		for (String ns : aw) {
			if (!map.containsKey(ns)) {
				map.put(ns, 1);
			} else {
				map.put(ns, map.get(ns) + 1);
			}
		}
		// i am indian i am indian  java Coder
		boolean b = false;
		Set<String> ob = map.keySet();
		for (String ob1 : ob) {
			int totalOcc = map.get(ob1);

			if (totalOcc > 1) {
				System.out.println(ob1 + "\t" + totalOcc);
			}
		}
		if (b) {
			System.out.println("There is No Duplicate in a String ...!");
		}
	}
}
