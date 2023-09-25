package test;

public class Delux_Pizza extends Pizza {

	public Delux_Pizza(boolean veg) {
		super(veg);
		super.addExtaChess();
		super.addExtraTopping();
	}

	@Override
	public void addExtaChess() {
		
		super.addExtaChess();
	}

	@Override
	public void addExtraTopping() {
		
		super.addExtraTopping();
	}
	

}
