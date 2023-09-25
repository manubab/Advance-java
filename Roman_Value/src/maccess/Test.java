package maccess;

public class Test {
	public static void getSum() {
		
		int n=18;
		int value=0;
		int i=0;
		
		while(n>=1)
		{
			value=value+(n%2)*2^i;
			n=n/2;
			i=i+2;
		}
		System.out.println(value);
		
	}
	public static void main(String[] args) {
		 getSum();
		
	}

}
