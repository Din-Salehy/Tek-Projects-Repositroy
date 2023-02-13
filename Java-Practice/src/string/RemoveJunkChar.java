package string;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		String s = "ABSFDF243234324 ++ @ #$%^ 7456456";
		
		String rem = s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(rem);
	}
}
