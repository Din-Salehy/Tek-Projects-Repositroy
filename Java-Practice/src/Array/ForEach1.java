package Array;

public class ForEach1 {

	public static void main(String[] args) {
		
		String [] numbers  = { "100013", "200015", "300013"};
		
		double sum = 0; 
		
		for (String value: numbers)
		{
			String amount = value.substring(0,4);
			String decimalAmount = value.substring(4,6);
			String concatAmount = amount +"."+decimalAmount; 
//			System.out.println(amount);
//			System.out.println(decimalAmount);
			System.out.println(concatAmount);
			
			double convertedToDouble = Double.parseDouble(concatAmount);
			sum += convertedToDouble;
			
		}
		System.out.println("Sum of all amount----> " + sum);
	}
}
