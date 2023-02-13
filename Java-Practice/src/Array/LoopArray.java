package Array;

import java.util.Arrays;

public class LoopArray {

	public static void main(String[] args) {
		
		int number [] = {100,200,300,400,500,600,700,800};
//		
//		for(int i =0; i <= number.length; i++)
//		{
//			System.out.println(number[i]);
//		}
//		
	int sum =Arrays.stream(number).sum();
	System.out.println(sum);
}
}