package Array;

public class GreatestNumbers {

	public static void main(String[] args) {

		int a = 255;
		int b = 355;
		int c = 56;

		if (a > b & a > c) {
			System.out.println("a is greatest numbers" + a);
		} else if (b > c) {
			System.out.println("b is greatest " + b);

		} else {
			System.err.println("c is grreatest");
		}
	}
}
