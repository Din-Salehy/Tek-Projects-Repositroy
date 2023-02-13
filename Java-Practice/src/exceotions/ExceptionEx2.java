package exceotions;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		String a = null;
		try
		{
			System.out.println(a.length());
		}
		catch (Exception e)
		{
			System.out.println("Some thing");
		}
	}
}
