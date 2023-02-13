package ifElseConditons;

public class IfElseCondition {
	public static void main(String[] args) {

		int age = 18;

		if (age >= 20) 
		{
			System.out.println("Eligible for vote");
		} 
		else 
		{
			System.out.println("Not Eligible for vote");
		}
		
		int weatherConditionInCelcius = 50;
		if (weatherConditionInCelcius >= 50)
		{
			System.out.println("It is too hot ");
		}
			
		else
		{
			System.out.println("The weather is good for picknic");
		}
	}
}