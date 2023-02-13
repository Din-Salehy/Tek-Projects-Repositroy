package inheritence;

public class SuperKeyword {

	String color = "White";

	void eating()
	{
		System.out.println("Eating.........");
	}
}


class Dog extends SuperKeyword {
	
//	String color = "Black";
//
//	void displayColor() {
//		System.out.println(color);
//		System.out.println(super.color);
//	}
	
	void eating()
	{
//		System.out.println("Eating Bread........");
		super.eating();
	}
}

