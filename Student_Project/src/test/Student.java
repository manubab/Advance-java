package test;
public class Student {
	public String rollNo;
    public String sName;
	public String branch;
	public Student(String rollNo,String sName,String branch){
		this.rollNo=rollNo;
		this.sName=sName;
		this.branch=branch;
	}
	public String toString() {
		return rollNo+"\t"+sName+"\t"+branch;
	}

}
