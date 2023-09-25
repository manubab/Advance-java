package com.test.sw;

public class Demo_Gc_2 {
	static int a=0;
	
	public void finalize() {
		System.out.println((++a)+"memory cleaned by..."+Thread.currentThread().getName());
	}
	
	static Demo_Gc_2 m1() {
		Demo_Gc_2 gc1=new Demo_Gc_2();
		Demo_Gc_2 gc2=new Demo_Gc_2();
		return gc2;
	}
	static 	Demo_Gc_2 m2() {
		Demo_Gc_2 gc3=new Demo_Gc_2();
		Demo_Gc_2 gc4=new Demo_Gc_2();
		return gc4;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Demo_Gc_2 gc=new Demo_Gc_2();
		new Demo_Gc_2();
		m1();
		m2();
		gc=null;
		System.gc();
		Thread.sleep(a);
	}

}
