package Map_Example_Programmig;
import java.util.*;
import java.util.stream.*;
class Employee{
	public String id;
	public String name;
	public int sal;
	public Employee(String id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}


public class MapDemo4 {
	public static void main(String[] args) {
		
		List<Employee> ob1=Arrays.asList
				(new Employee("A121","Sai",12000),
				 new Employee("A321","madhu",32000),
				 new Employee("A320","Manu",10000),
				 new Employee("A211","Mali",23000));
		
		List<Integer> ob2=new ArrayList<>();
		
	  ob2=ob1.stream()
		.filter(e->e.sal>20000)
		.map(e->e.sal+500)
		.collect(Collectors.toList());
	     
	     System.out.println(ob2);
	     
		
		
		
	}

}
