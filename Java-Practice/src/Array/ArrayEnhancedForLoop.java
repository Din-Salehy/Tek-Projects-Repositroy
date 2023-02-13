package Array;

public class ArrayEnhancedForLoop {

	public static void main(String[] args) {
		
		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };
		
		for (int r []:a) // a is the complete row (100,200) and store it in to "r" as single dimensional array
		{
			for (int i:r) // r  represent the single dimensional array, it will read it and store it in "i" 
			{
				System.out.println(i);
			}
		}
	}
}
