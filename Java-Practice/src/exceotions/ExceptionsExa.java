package exceotions;

public class ExceptionsExa {

	public static void main(String[] args) {

		int a = 100;

		try 
		{
		System.out.println(a/0);
		}
			catch (ArithmeticException e)
			{
				System.out.println("Some thing");
			}
		

		String b = null;
//		System.out.println(b.length());
		
		String c = "abc";
//		int x = Integer.parseInt(c);
		
		int arr [] = new int [5];
//		arr[10] = 50;

	}
}