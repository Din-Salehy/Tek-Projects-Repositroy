package Array;

public class NestedLoop {

	public static void main(String[] args) {

		for (int row = 0; row <= 10; row++) {
			for (int col = 0; col <= 10; col++) {
				int number = row * col;
				System.out.print(row + "*" +col + "=" + number +"\t" );
			}
			System.out.println();
		}
	
	}
}
