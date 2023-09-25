package strings_java_class;
public class Find_even_Number_Letter_Words_In_A_String {
	public static void main(String[] args) {
		String s = "i am a java coder and java progrmmer java devoloper";
		String w = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c != ' ' || i % 2 == 0) {
				w =w+ c;
			} else {
				System.out.println(w);
				w = "";
			}
		}
	}
}
