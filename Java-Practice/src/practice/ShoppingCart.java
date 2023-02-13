package practice;

public class ShoppingCart {

	public static void main(String[] args) {
		
		double applePrice = 12.25;
		int appleWeight = 2;
		
		double appleTotal =  applePrice* appleWeight;
		System.out.println(appleTotal);
		
		double orangePrice = 13.25;
		int orangeWeight = 2;
		
		double orangeTotal =  orangePrice* orangeWeight;
		System.out.println(orangeTotal);
		
		double totalToPay = appleTotal+ orangeTotal;
		System.out.println(totalToPay);
		
	}
}
