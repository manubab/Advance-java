package test;

public class Fruits {
	public String name;
	public int Qty;
	
	public Fruits(String name,int Qty)
	{
		this.name=name;
		this.Qty=Qty;
	}
	public String toString()
	{
		return name+"\t"+Qty;
	}

}
