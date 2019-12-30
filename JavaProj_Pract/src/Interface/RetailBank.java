package Interface;

public class RetailBank implements USBANK {
	
	public void credit() {
		
		System.out.println("Credit option");
		
	}
	
	public void Transaction() {
		
		System.out.println("Transaction option");
	}
	
	public void Withdrawal() {
		
		System.out.println("Withdrawal option");
	}
	
	public void Bankspecific_1() {
		
		System.out.println("Only for this bank");
	}

	public void Bankspecific_2() {
		
		System.out.println("Only for this bank 2");
	}
	
	
	

}
