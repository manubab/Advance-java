package test;

public class Pizza {
	
	private int price;
	private boolean veg;
	
	
	
	private int extraCheese=100;
	private int extraToppingsprice=150;
	private int backPack=20;
	
	private int bpP;
	
	 private boolean isExtraChessAdded =false;
	 private boolean isExtraToppingAdded=false;
	 private boolean isOptedForAdded=false;
	 
	
	public Pizza( boolean veg) {
		
		this.veg = veg;
		
		if(this.veg) {
			this.price=300;
			
		}else {
			this.price=400;
		}
		bpP=this.price;
	}
	
	
	public void addExtaChess() {
		isExtraChessAdded=true;
		this.price+=extraCheese;
	}
	public void addExtraTopping() {
		isExtraToppingAdded=true;
		this.price+=extraToppingsprice;
	}
	public void takeAway() {
		isOptedForAdded=true;
		this.price+=backPack;
	}
	
	public void getBill() {
		String bill="";
		System.out.println("pizza :"+bpP);
		if(isExtraChessAdded) {
			bill+="Extra Chesse Added"+extraCheese+"\n";
		}
		if(isExtraToppingAdded) {
			bill+="Extra Toppings Added"+extraToppingsprice+"\n";
		}
		if(isOptedForAdded) {
			bill+="Extra take away "+backPack+"\n";
		}
		
		bill+="bill:"+this.price+"\n";
		System.out.println(bill);
			
		
	}

}









/*
 * 
 * Base pizza 300
 * Topping 150
 * chess 100
 * take away 20
 * 
*/
