package Array;

public class LoopCharacters {

	public static void main(String[] args) {
		
		char [] letters= {'G','o','o','d',' ','M','o','r','n','i','n','g'};
		
		String newLetter = "";
		
		for (int i  = 0; i <(letters.length); i++)
		{
			newLetter = newLetter +letters[i];
			
		}
		System.out.println(newLetter);
	
//		String upperCase = newLetter.toUpperCase();
//		System.out.println(upperCase);
		
	}
}
