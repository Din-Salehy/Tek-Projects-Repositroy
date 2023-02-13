package Array;

public class Sum2DArray {

	public static void main(String[] args) {
		
		int numberA [] = {12,13,13,114,15,16};
		int numberB [] = {44,55,66,77,88,900};
		
		int resultA = 0;
		
		int resultB = 0;
		
		for (int i = 0; i<numberA.length; i++)
		{
			resultA += numberA[i]; 
		}
		
		System.out.println(resultA);
		
		for (int i =0; i<numberB.length; i++)
		{
			resultB += numberB[i];
		}
		System.out.println(resultB);
		
		int total = resultA +resultB;
		System.out.println(total);
		
	}
}
