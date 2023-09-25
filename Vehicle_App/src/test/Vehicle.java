package test;

public class Vehicle {
	private String name;
	private int currentSpeed;
	private int currentDirection;
	
	
	public Vehicle(String name) {
		
		this.name = name;
		this.currentSpeed=0;
		this.currentDirection = 0;
	}
	
	public void stear(int direction) {
		this.currentDirection+=direction;
		System.out.println("Steer method called: Steering at"+currentDirection);
		
	}
      public void move(int speed,int direction) {
    	  currentSpeed=speed;
    	  currentDirection=direction;
    	  
    	  System.out.println("move method called : Moving at :"+currentSpeed+"in direction"+currentDirection);
    	  
		
	 }

	public String getName() {
		return name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	public void stop(int rate) {
		this.currentSpeed=0;
	}
	
	
	
}
