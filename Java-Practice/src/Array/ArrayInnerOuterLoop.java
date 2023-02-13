package Array;

public class ArrayInnerOuterLoop {

	public static void main(String[] args) {

		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };
		
		System.out.println("number of rows " +a.length);
		System.out.println("Number of clumns " + a[0].length); // 0 is the rows it represent how many columns we have in this row
		
		System.out.println("-------------------------------------");
		
		for (int i = 0; i < a.length; i++) {
		
			for (int j = 0; j < a[i].length; j++) // i represent rows
			{
				System.out.print(a[i][j]);
			}

		}
	}
}
