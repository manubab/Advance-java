package flash_Map;
import java.util.*;
import java.util.stream.Collectors;
class Student{
	String id;
	String name;
	String grade;
	
	public Student(String id,String name,String grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
}

public class Demo3 {
	public static void main(String[] args) {
		
		List<Student> ob1=new ArrayList<Student>();
		
		ob1.add(new Student("A121","Raju","A"));
		ob1.add(new Student("A221","Daddy","B"));
		ob1.add(new Student("A111","madhu","C"));
		ob1.add(new Student("A114","Raj","D"));
		
		
		
        List<Student> ob2=new ArrayList<Student>();
		
		ob2.add(new Student("A121","Raju","A"));
		ob2.add(new Student("A221","Daddy","B"));
		ob2.add(new Student("A111","madhu","C"));
		ob2.add(new Student("A114","Raj","D"));
		
		
		
		List<List<Student>> ob3=Arrays.asList(ob1,ob2);
		 
		for(List<Student> ob:ob3)
		{
			for(Student s:ob)
			{
				System.out.println(s.name);
			}
		}
		
	List<String> names=ob3.stream().flatMap(e->e.stream()).map(e->e.name).collect(Collectors.toList());
	
	System.out.println(names);
	
		
	}

}
