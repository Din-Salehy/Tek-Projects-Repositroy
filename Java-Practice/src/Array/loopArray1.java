package Array;

public class loopArray1 {

	public static void main(String[] args) {
		
		int numbers [] = {12,22,33,44,55,66,77,88};
		
		int counter =0;
		for (int i =0; i<numbers.length; i++)
		{
		if(numbers [i] == 22) {
			
			System.out.println(numbers[i]);
		}
		counter ++;
		System.out.println(counter);
		if(counter== 2)
		{
			break; 
		}
		}
		
	}
}
