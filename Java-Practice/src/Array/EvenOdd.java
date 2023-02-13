package Array;

public class EvenOdd {

	public static void main(String[] args) {
		
		int [][] numbers = {{12,34,36}, {65,78,99}, {66,32,79}};
		
		//Find even and odd number at 2,1
		
		int number = numbers [2][2];
		
		if (number % 2 == 0)
		{
			System.out.println("The number is even " + number);
		}
		
		else
		{
			System.out.println("The number is even " + number);
		}
		
		System.out.println("the number at index 1 and 2 is " + numbers[1][2]);
	}
}
