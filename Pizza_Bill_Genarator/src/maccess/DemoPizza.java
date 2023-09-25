package maccess;
import java.util.*;
import test.Pizza;
import test.Delux_Pizza;
public class DemoPizza {
	public static void main(String[] args) {
		Pizza bp=new Pizza(true);
	
		bp.addExtraTopping();
		bp.addExtaChess();
		bp.takeAway();
		bp.getBill();
		
		Delux_Pizza dp=new Delux_Pizza(false);
         
       dp.takeAway();
		dp.getBill();
		
	}

}

