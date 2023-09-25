package problems;
import java.util.*;
public class Test {
	@SuppressWarnings("removal")
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		int[][] n=new int[3][3];
		int s=n.length;
		System.out.println(s);	
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n.length;j++) {
				n[i][j]=new Integer(sc.nextInt(i));
			}	
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.add();
	}
}
