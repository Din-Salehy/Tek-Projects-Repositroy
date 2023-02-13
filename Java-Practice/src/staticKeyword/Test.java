package staticKeyword;

public class Test {

		int nonStaticNumber= 400;
		static String name; 
		static int number1 = 100;
		static int number2 = 200;
		static int add() 
		{
		return number1+number2;
		}
		
		
		public static void main(String[] args) {
			Test.name = "John";
			Test.add();
			System.out.println(Test.name);
			
			Test obj = new Test();
			int nonStNumber = obj.nonStaticNumber;
			System.out.println(Test.add());
			
	}
		
		
}
