package maccess;
import java.util.*;
public class DemoThread {
	public static void main(String[] args) {
		
		new Thread(()-> {
			for(int i=1;i<=10;i++)
			{
				System.out.println("Registration  Thread...!");
				try {
				Thread.sleep(1200);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		}).start();;
		new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Login Thread...! ");
				try {
				Thread.sleep(1200);
				
			}catch(Exception e)
				{
				e.printStackTrace();
				}
			
		}
			
		
	}).start();;
		
		
		
	}
	
}
		
		
		
	


