package maccess;

import java.io.*;

public class Employee implements Serializable {
	public String ename,desg;
	public int sal;
	public Employee(String ename, String desg, int sal) {
		super();
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return  " " +ename + "  " + desg + "  " + sal ;
	}
	
	
	 

}
