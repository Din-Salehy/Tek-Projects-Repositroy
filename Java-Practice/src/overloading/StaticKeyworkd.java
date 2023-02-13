package overloading;

public class StaticKeyworkd {

	static int a = 10;
	int b = 20; 
	
	static void m1()
	{
		System.out.println("This is m1 static method");
	}
	
	 void a1()
	{
		System.out.println("This is m1 static method");
	}
	
	
	void m2()
	{
		System.out.println("this is not static method");
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		// Static method can access only static stuff (Direct access-without creating object.)
		
		System.out.println(a);
		m1();
		
	}
}
