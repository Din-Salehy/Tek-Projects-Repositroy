package exceotions;

public class Finally {

	public static void main(String[] args) {
		
		int a = 100;
		
		try 
		{
		System.out.println(a/0);	
		}
		catch(Exception e)
		{
			System.out.println("Catch block esceution");
		}
		finally
		{
			System.out.println("Fianlly block execution");
		}
		
	}
}
