package maccess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {

	public String name, code;
	public int price;

	public Product(String name, String code, int price) {
		
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return code + "\t" + name + "\t" + price;
	}
}

public class filterDemo3 {
	public static void main(String[] args) {
		List<Product> ob1 = new ArrayList<>();

		ob1.add(new Product("A121", "Mouse", 12000));
		ob1.add(new Product("A121", "Mouse", 15000));
		ob1.add(new Product("A121", "Mouse", 18000));
		ob1.add(new Product("A121", "Mouse", 19000));
		ob1.add(new Product("A121", "Mouse", 13000));
		
		List<Product> ob2=ob1.stream().filter(p->p.price>16000).collect(Collectors.toList());
		System.out.println(ob2);

	}

	

}
