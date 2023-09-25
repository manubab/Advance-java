package test;

import java.util.*;

interface IComparable {
	public abstract int compare(int a, int b);

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value -1");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("====Choices====");
		System.out.println("1.Greater_value" + "\n\t2.Smaller_Value");
		System.out.println("Enter choice :");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			IComparable i1 = new IComparable() {
				public int compare(int a, int b) {
					if (a > b) {
						return a;
					} else {
						return b;
					}

				}

			};
			int r1 = i1.compare(a, b);
			System.out.println("Greater value :" + r1);

			break;
		case 2:

			IComparable i2 = new IComparable() {
				public int compare(int a, int b) {
					if (a < b) {
						return a;
					} else {
						return b;
					}

				}

			};
			int r2 = i2.compare(a, b);
			System.out.println("Smaller value :" + r2);
			break;

		default:
			System.out.println("invalid choice...!");

		}

	}

}
