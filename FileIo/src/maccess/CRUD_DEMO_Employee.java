package maccess;

import java.util.*;
import java.io.*;

public class CRUD_DEMO_Employee {
	@SuppressWarnings({ "unchecked", "unlikely-arg-type", "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Employee> ob = new HashMap<String, Employee>();
		File f = new File("Employee.txt");
		FileOutputStream fos;
		FileInputStream fis = null;
		ObjectOutputStream oos;
		ObjectInputStream ois = null;

		while (true) {
			System.out.println("-----------choice------------");
			System.out.println("\t1.insert " + "\n\t2.display" + "\n\t3.search" + "\n\t4.update" + "\n\t5.delete"
					+ "\n\t6.sorting");

			System.out.println("Enter your choice :");

			switch (sc.nextInt()) {
			case 1:
				sc.nextLine();
				System.out.println("Enter eid :");
				String eid = sc.nextLine();
				System.out.println("Enter ename:");
				String ename = sc.nextLine();
				System.out.println("Enter desg :");
				String desg = sc.nextLine();
				System.out.println("Enter sal");
				int sal = sc.nextInt();

				ob.put(eid, new Employee(ename, desg, sal));

				try {
					fos = new FileOutputStream(f);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(ob);
					System.out.println("data Successfully addedd....!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				if (f.isFile()) {
					try {
						ois = new ObjectInputStream(new FileInputStream(f));
						ob = (HashMap) ois.readObject();

						ois.close();

						ob.forEach((p, q) -> {
							System.out.println(p.toString() + q.toString());
						});

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("File not exits....!");
				}
				break;
			
			case 5:
				System.out.println("Enter eid");
				String Eid=sc.nextLine();
				sc.nextLine();
				
			
				try {
					ois=new ObjectInputStream(new FileInputStream(f));	
					ob=(Map<String, Employee>) ois.readObject();	
						ob.keySet().contains(Eid);
						
							ob.remove(ob.remove(ob.get(Eid)));
							System.out.println("Object removed Successfuly");
							
						
						
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			}

		}
	}

}
