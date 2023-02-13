package Array;

public class NestedLoop2 {

	public static void main(String[] args) {
		
		int [][]  numbers = { {100,200,300}, {10,20,300}, {45,55,66,77},{34,77,88,99}};
		
		for (int row =0; row< numbers.length; row ++){
			
			for (int col =0; col<numbers[row].length; col++) {
			
//				System.out.println(numbers[row][col]);
				 int number = numbers[row][col];
				 
				 if (number %2 ==0)
				 {
					 System.out.println("even number "+ number);
				 }
				 
				 if (number % 2 != 0) {
					 System.out.println("odd number " + number);
				 }
			}
		}
		
	}
	
}
