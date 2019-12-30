package Interface;

public class BankTest {

	public static void main(String[] args) {
		
		//Static Polymorphism is used
		
		RetailBank obj = new RetailBank();
		
		obj.Bankspecific_2();
		obj.credit();
		obj.Transaction();
		obj.Withdrawal();
		
		System.out.println("*********************************************");
		
		//Dynamic Polymorphism:  Where the child class object can be referred by the parent object reference
		
		USBANK ub= new RetailBank();
		
		ub.credit();
		

	}

}
