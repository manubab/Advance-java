package strings_java_class;

public class String1 {
	public static void main(String[] args) {
		int n=0;
		String w="";
		String s="java project is contains multible tables";
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
		
			if(ch!=' ') {
			w+=ch;
			}
			else {
				System.out.println(w);
			w="";
			}
		}
	}

}
