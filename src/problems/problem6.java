package problems;

public class problem6 {
	
	public  static  void primeNo(int num )
	{
		int num2 = num ;
		int count = 0;
 
		for ( int i =1 ; i <= num2 ; i++)
		{
			if (num2 % i == 0)
			{
				count++ ;
			}
		}
		if (count== 2)
		{
			 
			 System.out.println("  "+num2 );
		
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 6- Write a program to print all prime numbers from 1-1000
	
		
		System.out.println(" print all prime numbers from 1-1000");
		
		
		for( int i =1 ; i <= 1000 ;i++)
		{
			primeNo(i);
		}
	      

}
}
