package string;

public class ReverseString {

	public static void main(String[] args) {
		
		String greeting = "Welcome to TekSchool";
		
		int len= greeting.length();
		
		String rev = "";
		for (int i = len-1; i>= 0; i--){
			
			rev =rev + greeting.charAt(i);
		}
		System.out.println(rev);
	
	StringBuffer s = new StringBuffer(greeting);
	System.out.println(s.reverse());
	
	
	
	String a = "World is beautiful";
	
	int le = a.length();
	
	String rev1 = "";
	for (int i = le-1; i >=0; i--) {
		 rev1 =rev1 + a.charAt(i);
		 
	}
	System.out.println(rev1);
	}
	
	
}
