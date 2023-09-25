package test;

public class Car extends Vehicle{
	
	
	private int wheels;
	private String type;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	public Car(String name, String type,int wheels,int doors,int gears, boolean isManual) {
		super(name);
		
		this.type=type;
		this.gears=gears;
		this.doors=doors;
		this.wheels=wheels;
		currentGear=1;
		
	}
	
	public  void changeGear(int newGear) {
		currentGear=newGear;
		System.out.println("ChengeGear method called :Changed to "+this.currentGear+" gear");
		
	}
	public void chengeSpeed(int newSpeed,int newDirection) {
		move(newSpeed,newDirection);
		System.out.println("Chenge speed method called:Speped"+newSpeed+"direction"+newDirection);
		
		
	}
	
}
