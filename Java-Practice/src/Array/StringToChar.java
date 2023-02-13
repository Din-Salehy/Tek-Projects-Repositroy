package Array;

public class StringToChar {

	public static void main(String[] args) {
		
		String text = "Welcome to TekSchool";
		
		char [] textInChar = text.toCharArray();
		
		for (char character:textInChar)
		
		System.out.print("(" +character +")");
	}
}
