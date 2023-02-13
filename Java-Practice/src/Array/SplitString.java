package Array;

public class SplitString {

	public static void main(String[] args) {
		
		String text = "Welcome to Canada";
	String[] splittedText = (text.split("Welcome"));
	for(int i =0; i<splittedText.length ; i++)
	{
		System.out.println(splittedText[i]);
	}
	}
}
