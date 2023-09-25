package maccess;

import java.util.Scanner;

public class Demo_StringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (true) {

			System.out.println(" ****choice..");
			System.out
					.println("\t1.append()" + "\n\t2.insert()" + "\n\t3.delete()" + "\n\t4.reverse()" + "\n\t5.exit()");

			System.out.println("Enter your choice..");
			switch (Integer.parseInt(sc.nextLine())) {

			case 1:
//			   add data..

				System.out.println("Enter the String : ");
				sb.append(sc.nextLine() + " ");
				System.out.println(sb.toString());

				break;

			case 2:
//			   insert data..

				if (sb.length() == 0) {
					System.out.println("buffer is empty");
				} else {
					System.out.println("Enter the stating index positon....");
					int si = Integer.parseInt(sc.nextLine());
					if (si >= 0 && si <= sb.length() - 1) {
						System.out.println("Enter the String..");
						sb.insert(si, sc.nextLine() + " ");
						System.out.println(sb.toString());

					} else {
						System.out.println("invalid index....");
					}

				}
				break;
			case 3:

//			   delete data ..
				if (sb.length() == 0) {
					System.out.println("Buffer is empty....");
				} else {
					System.out.println("Enter the Strat index : ");
					int dsi = Integer.parseInt(sc.nextLine());
					if (dsi >= 0 && dsi <= sb.length() - 1) {
						System.out.println("Enter the end index : ");
						int dei = Integer.parseInt(sc.nextLine());
						if (dei > dsi) {
							sb.delete(dsi, dei);
							System.out.println(sb.toString());

						} else {
							System.out.println("delete end index is more than start index");
						}
					}
				}

				break;
			case 4:
//			    reverse data...
				if (sb.length() == 0) {
					System.out.println("Buffer is empty...");
				} else {
					sb.reverse();
					System.out.println(sb.toString());
				}

				break;

			case 5:
				System.out.println("operation ended....");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice....");

			}
		}
	}

}
