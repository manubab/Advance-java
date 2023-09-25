package maccess;
import test.*;
public class demoThread2 {
	public static void main(String[] args) {
         new Thread(Login::log).start();
		new Thread(Registar::reg).start();
		
	}

}
