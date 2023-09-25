package maccess;
import java.util.Scanner;
import test.*;
public class Demo_String_Project1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno :");
		String rollno = sc.nextLine();
		int len = rollno.length();
//		verify student roll no correct or not
		if (len == 10) {
			String brcode = rollno.substring(6, 8);
			GenarateBranch gb = new GenarateBranch();
			String branch = gb.genarate(brcode);
//	    verify branch
			if (branch == null) {
				System.out.println("rollno hold invalid brcode");
			} else {
				System.out.println("Enter the Student name : ");
				String name = sc.nextLine();
				System.out.println("Enter the branch :");
				String br = sc.nextLine().toUpperCase();
				CheckBranch cb = new CheckBranch();
				boolean k = cb.verify(branch);
				if (k) {
					if (branch.equals(br)) {
						System.out.println("***** Enter 6 subject marks");
						int i = 1, total = 0;
						while (i <= 6) {
							System.out.println("Enter sub marks :");
							
							int sub = sc.nextInt();
							if(sub<35) {
								System.out.println("fail");
								break;
							}
							if (sub < 0 && sub >= 100) {
								System.out.println("invalid marks...");
								continue;
							}
							total = total + sub;
							i++;
						}
						System.out.println("rollno : " + rollno);
						System.out.println("name : " + name);
						System.out.println("branch :" + br);
						System.out.println("Total Marks :" + total);
						float per = (float) total / 6;
						System.out.println("Percentage: " + per);
						StudentResults sr = new StudentResults();
						String res = sr.results(per);
						System.out.println("result :" + res);
					} else {
						System.out.println("rollno not matched with branch....");
					}
				} else {
					System.out.println("invalid branch .....");
				}
			}
		} else {
			System.out.println("invalid rollno ....!");
		}
		sc.close();
	}
}
