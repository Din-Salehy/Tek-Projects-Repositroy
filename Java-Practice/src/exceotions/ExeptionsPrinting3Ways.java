package exceotions;

public class ExeptionsPrinting3Ways {

	public static void main(String[] args) {

		int a = 21;

		try {
			int result = a / 0;
			} 
		catch (Exception e) 
		{

			System.out.println(e);
			System.out.println("--------------------------");
			System.out.println(e.getMessage());
			System.out.println("--------------------------");
			e.printStackTrace();
		}
		
		
	}
}