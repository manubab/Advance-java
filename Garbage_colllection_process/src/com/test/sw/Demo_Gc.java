package com.test.sw;

public class Demo_Gc {
	
	@Override
	public void finalize() {
		System.out.println("Memeory cleaned :"+Thread.currentThread().getName());
	}
	
	public static void main(String[] manu) {
		Demo_Gc dg=new Demo_Gc();
		
		new Demo_Gc();// un used memeory...//annonymous One
		new Demo_Gc();// un used memeory...//annonymous One

		
		dg=null;

//		System.gc();
		Runtime.getRuntime().gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("manu you can handle code...");
			
		}

		System.out.println("program ended...!");
		
		
		
	
		
	}
	
}
