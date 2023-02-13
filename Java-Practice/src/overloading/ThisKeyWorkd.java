package overloading;

public class ThisKeyWorkd {

	int a , b;					// Instance or class variables.
	
	void getValues(int a , int b) // Method variables/ external variables
	{
	this.a=a;
	this.b=b;
	}
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		ThisKeyWorkd obj = new ThisKeyWorkd();
		obj.getValues(10, 20);
		obj.printValues();
	}
}
