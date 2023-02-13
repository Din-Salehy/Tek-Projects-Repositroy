package practice;

public class FindText {

	public static void main(String[] args) {
		
		java.lang.String text = "Welcome to University of Georgia";
		
		java.lang.String searhcText ="to";
		
		if (text.indexOf(searhcText) !=-1){
			System.out.println("The text is  avaiable");
			
		}else {
			System.out.println("the is not available");
		}
		
	}
}
