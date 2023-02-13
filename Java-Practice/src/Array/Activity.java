package Array;

public class Activity {

	public static void main(String[] args) {
		
		//Print numbers from 100--1000;
		
		int number;
		
		for (number =100; number<=110; number ++)
		{
			if (number %2 ==0)
			{
				System.out.println(number);
			}
					
		}
		
		// Print odd number
		
		for (number =100; number <= 110; number ++)
		{
			if (number %2 !=0)
			{
				System.out.println(number);
			}
		}
	}
}
