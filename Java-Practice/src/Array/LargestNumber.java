package Array;

public class LargestNumber {

	public static void main(String[] args) {
		
		int numbers [] = {12,22,33,44,55,66,77,88};
		
		int max = 0;
		
		for (int i =0; i<numbers.length; i ++)
		{
		if(max<numbers[i]) {
			max = numbers[i];
		}
		}
		System.out.println(max);
	}
}
