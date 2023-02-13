package Array;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int a[] = { 100, 200, 300, 400, 500, 600, 700 };
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);

		System.out.println("------------------------------");
		
		int b[][] = { { 100, 200, 300 }, { 232, 232, 436 } };
		int c[][] = { { 343, 434, 566 }, { 347, 394, 454 } };

		int d[][] = new int[2][3]; // 2 number of rows and 3 number of column.

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < c.length; j++) {
				d[i][j] = b[i][j] + c[i][j];
				System.out.println(c[i][j]);
			}
		}
	}
}
