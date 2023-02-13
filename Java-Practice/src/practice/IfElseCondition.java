package practice;

public class IfElseCondition {

	public static void main(String[] args) {
		
		java.lang.String genderA = "other";
		
		if (genderA.equals("Male"))
				{
					System.out.println("He is man");
				}
		
		else if (genderA.equals("Female"))
		
		{
			System.out.println("The person is femal");
		}
		
		else
		{
			System.out.println("Better not to say anything");
		}
	
		
		boolean roadIsblocked =true;
		
		if (roadIsblocked == false)
		{
			System.out.println("I will go home");
		}
		
		else
		{
			System.out.println("I will not go home");
		}
		
		 int age = 24;
		 
		 boolean eligibleToDrive = age >=24 && age <=24;
		 
		 System.out.println("Eligible to Drive " +eligibleToDrive);
		 
	}
}
