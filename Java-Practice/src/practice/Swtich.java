package practice;

public class Swtich {

	public static void main(String[] args) {
		
		char  gender  = 'D';
		
		switch (gender)
		{
		case 'M':
		
			System.out.println("You are man");
			break;
		
			case 'F':
				System.out.println("You are Female");
				break;
				
			case 'O':
				System.out.println("Prefer not to say");
				break;
				
				default: 
					System.out.println("Wrong data");
		}
	}
}
