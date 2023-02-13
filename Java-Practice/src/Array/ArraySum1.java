package Array;

import java.util.Arrays;

public class ArraySum1 {

	public static void main(String[] args) {
		
		int [] numbers = {100,200,300,400, 500};
		
		int sum = Arrays.stream(numbers).sum();
		
		System.out.println(sum);
		
		int result = 0;
//		result +=numbers[0];
//		result +=numbers[1];
//		result +=numbers[2];
//		result +=numbers[3];
//		result +=numbers[4];
//		
//		System.out.println(result);
//		
		for (int i =0; i< numbers.length; i++) 
		{
				result +=numbers[i];
				
		}
		
		System.out.println(result);
}
	}
