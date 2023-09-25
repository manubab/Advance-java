package maccess;
/*
 * 
 * Application:
 A class Student is given to you. It contains the following implementation.
 Instance Variables: studentId : int , name :String , examFee:double
 Methods: displayDetails(): String , payFee() :double
 Default constructor, an all-fields constructor and a toString method.
 Create two sub classes of Student called DayScholar and Hosteller. Add the following
 implementations to each class.
 DayScholar:
 Instance Variables : transportFee:double ,
 Methods: Default constructor and an all-fields constructor
 Hosteller:
 Instance Variables: hostelFee :double
 Methods: Default constructor and an all-fields constructor .
 Add the following methods in BOTH classes.
 Method: displayDetails(): This method should return a string containing the details of the
 student in the following format:
 Student [name=John Smith,studentId=123,examFee=100.0] OR
 DayScholar[transportFee=500, name=John Smith,studentId=123,examFee=100.0] and so on.
 Method: payFee(amount): This method takes amount as parameter that represents the fee
 provided. You must calculate and
 then return the remaining amount paid in excess. If excess is paid, the returned amount will be
 negative. The total fees that each student must pay must include all the fees applicable to that
 Student(examFees, transportFees, hostelFees as applicable). Subtract the given amount from
 total fee for each student and return the remaining amount.
 A class StudentTester is given to you with a main method. Use this class to test your solution&#39;s
 classes and methods.
 */
import test.*;
import java.util.*;
public class Demo_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student type  :");
		String s=sc.nextLine().toUpperCase();
		switch(s) {
		case "DAYSCHOLAR" :
			 Dayscholar d=new Dayscholar();
			 System.out.println("Enter Student id :");
			 d.studentId=Integer.parseInt(sc.nextLine());
			 System.out.println("Enter Student name :");
             d.sName=sc.nextLine();
             System.out.println("Transport fee :");
             d.transportFee=Double.parseDouble(sc.nextLine());
             System.out.println("Enter exam fee :");
             d.examFee=Double.parseDouble(sc.nextLine());
             System.out.println("Enter paid amount :");
             double amount=Double.parseDouble(sc.nextLine());
             double nbal= d.payFee(amount-(d.examFee+d.transportFee));
            System.out.print("StId :"+d.studentId);
            System.out.print("sName:"+d.sName);
            System.out.print("Exam fee"+d.examFee);
            System.out.print("Transport fee :"+d.transportFee);
            System.out.print("nBal :"+nbal);
			break;
		case "HOSTELLER":
			Hosteller  h1=new Hosteller();
			 System.out.println("Enter Student id :");
			 h1.studentId=Integer.parseInt(sc.nextLine());
			 System.out.println("Enter Student name :");
             h1.sName=sc.nextLine();
             System.out.println("Hostel Fee :");
             h1.hostelFee=Double.parseDouble(sc.nextLine());
             System.out.println("Enter exam fee :");
             h1.examFee=Double.parseDouble(sc.nextLine());
             System.out.println("Enter paid amount :");
             double amount1=Double.parseDouble(sc.nextLine());
             double nbal1= h1.payFee(amount1-h1.examFee+h1.hostelFee);
             System.out.print("\nStId :"+h1.studentId);
             System.out.print("sName:"+h1.sName);
             System.out.print("Exam fee"+h1.examFee);
             System.out.print("Transport fee :"+h1.hostelFee);
             System.out.print("nBal :"+nbal1);
			break;
		
		default:
			System.out.println("Invalid choice ...! ");
		
		}
	}
}
