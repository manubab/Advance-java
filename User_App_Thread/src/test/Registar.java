package test;

public class Registar {
	public static void reg()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Registration User 1.....!");
			try {
			Thread.sleep(1200);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
