package test;
import java.util.*;
public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int price;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setaAuthor(String author) {
		this.author = author;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;

	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return title + "\t" + author + "\t" + price;
	}

	public int compareTo(Book o) {
		int i = this.title.compareTo(o.title);

		if (i != 0) 
			return i;
		
		i=this.author.compareTo(o.author);
		if(i!=0)
		return i;
		return Integer.compare(this.price, o.price);
		
	}
	public static void main(String[] args) {
		List<Book> ob=new ArrayList<>();
		ob.add(new Book("Core Java","Ventat",1200));
		ob.add(new Book("Ad Java","Mansani",1300));
		ob.add(new Book("Oracle","Sudha",800));
		ob.add(new Book("HTML","Sarma",1000));
		
	    System.out.println("BeFore Operatons");
//	   ob.forEach((k)->System.out.println(k.toString()));
	   
	    //first way with lambda
	    
	 //  Comparator<Book> bA=(b1,b2)->b1.getAuthor().compareTo(b2.getAuthor());
	//   ob.sort(bA);
	//   System.out.println("After Useing Comparater"+ob);
	    
	    // second Way with Method references
	    
	    Comparator<Book> bytitle =Comparator.comparing(Book::getTitle);
	    Comparator<Book> byprice =Comparator.comparing(Book::getPrice);
	    
	    ob.sort(Comparator.comparing(Book::getPrice));
	    System.out.println("With Method references :"+ob);
	    
	   


	}
	

	

}
