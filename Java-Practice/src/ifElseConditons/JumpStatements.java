package ifElseConditons;

public class JumpStatements {

	public static void main(String[] args) {
		
		/*for (int i =1; i<=10; i++)
		{
			if (i==5)
			{
				break;
			}
			System.out.println(i);
		}*/
	
		for (int i =1; i<=10; i++)
		{
			if (i==5 || i ==7 || i ==9)
			{
				continue; // It will jump 5,9,7 and then continue
			}
			System.out.println(i);
		}
	
	}
}
