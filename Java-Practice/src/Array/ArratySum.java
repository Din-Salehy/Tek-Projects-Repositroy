package Array;

public class ArratySum {

	public static void main(String[] args) {
		
		int [] numbers = {100,200,300,400,400,500};
		
		double sum=0;
		
		for (int i =0 ; i<numbers.length; i++)
		{
		sum +=numbers[i];
			
		}
		System.out.println("For loop result is ----> "+sum);
		
		
		//Using for each loop
		
		int sum1 =0;
		for (int value:numbers)
		{
			sum1 += value;
		}
		System.out.println("For each loop result is ----> " + sum1);
	}
}
