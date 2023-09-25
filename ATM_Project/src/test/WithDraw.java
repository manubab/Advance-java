package test;

public class WithDraw implements Transaction {

	
	public void process(int amt) {
		
		if(amt<b.bal) {
			if(amt%100==0) {
				b.bal=b.bal-amt;
				System.out.println("Balence :"+b.getBalence());
				System.out.println("Trasaction completed ..!");
			}else {
				System.out.println("invalid amount...!");
			}
		}else {
			System.out.println("inSufficient funds..");
		}
		
	}

}
