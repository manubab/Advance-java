package test;

public class Deposit implements Transaction {


	public void process(int amt) {
		if(amt%100==0) {
		b.bal=b.bal+amt;
		System.out.println("balence :"+b.getBalence());
		System.out.println("Trasection completed..");
		}else {
			System.out.println("invalid amount....!");
		}
	}
	

}
