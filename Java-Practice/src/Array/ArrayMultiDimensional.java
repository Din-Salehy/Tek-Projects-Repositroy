package Array;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
		int [][] numbers = {{1,2,3}, {5,6,8}};
		
		for (int i =0; i<numbers.length; i++)
			for(int j =0 ; j<numbers[i].length;j++ )
			{
				System.out.println(numbers[i][j]);
			}
		
				
	}
}
