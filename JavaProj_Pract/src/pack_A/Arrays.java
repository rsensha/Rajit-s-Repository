package pack_A;

public class Arrays 
{   //1D Array
	public void Array_1()
	{
		int d[] = {00,11,22,33};
		
		for(int i=0;i<4;i++)
		{
			System.out.println("  " +  d[i]);
		}
	}
	
	


	public void Array_2()
	{
		int d1[][]={ 
				  {000,111,222,333},
		          {00,11,22,33},
		          {0000,1111,2222,3333}
		};
		
		for(int i=0;i<3;i++)                            //Counting the number of rows
		{
			for(int j=0;j<4;j++)                        //Counting the number of columns
			{
				System.out.print("  "+ d1[i][j]);
			}
			
			System.out.println();
		}
		
		
		          
	
		
	
}
	 

}
