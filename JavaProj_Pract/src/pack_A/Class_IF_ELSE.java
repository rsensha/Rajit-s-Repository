package pack_A;

public class Class_IF_ELSE {
	
	public void ODDEvenChecking (int Inputnumber) {
		
		if(Inputnumber <0)
		{
		System.out.println("Number is Negative");
		}
		
		else if(Inputnumber ==0)
		{
			System.out.println("Neither positive nor negative");
			 
		}
		else if(Inputnumber >0 && Inputnumber %2==0)
		{
			System.out.println("Number is even andPositive");
		}
		
		
		else
			System.out.println("The number is odd");
	}

}
