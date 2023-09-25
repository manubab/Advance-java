package test;
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
 * 
 */
public class Dayscholar extends Student {
	public  double transportFee;
	public double payFee(double amount){
		return amount +transportFee;
	}
	

}
