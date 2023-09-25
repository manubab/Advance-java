package maccess;
import java.util.*;

import test.*;

public class Atm_Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		abc: while (true) {
			System.out.println("Enter the pinNo");
			int pinNo = sc.nextInt();
			if (pinNo >= 1000 && pinNo <= 9999) {
				CheckPinNO cpn = new CheckPinNO();
				boolean k = cpn.verify(pinNo);
				if (k) {
					System.out.println("==Choice===");
					System.out.println("t1.Withdraw" + "\n\t2.Deposit");
					System.out.println("Enter Choice...");
					int n = sc.nextInt();
					switch (n) {
					case 1:
						System.out.println("Enter withdraw amt");
						int wamt = sc.nextInt();
						WithDraw w = new WithDraw();
						w.process(wamt);
						break abc;
					case 2:
						System.out.println("Enter deposit amt");
						int damt = sc.nextInt();
						Deposit d = new Deposit();
						d.process(damt);
						break abc;
					default:
						System.out.println("invalid choice..");
					}
				} else {
					System.out.println("inCurrect pin..!");
					count++;
				}
			} // if is end..1
			else {
				System.out.println("invalid pin.. ");
				count++;
			}
			if (count == 3) {
				System.out.println("Trasection bloked..");
				break;
			}
		} // while end
	}
}

//System.out.print("Enter bank name :");
//String bankName=sc.nextLine();
//System.out.print("Enter bank IFSC Code :");
//String bankIFSCCOde =sc.nextLine();
//System.out.println("Enter AType :");
//String AType=sc.nextLine();
//System.out.print("Enter Account Number :");
//int AccNum=Integer.parseInt(sc.nextLine());
