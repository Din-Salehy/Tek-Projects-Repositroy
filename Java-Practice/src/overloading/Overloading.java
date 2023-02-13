package overloading;

public class Overloading {

	void add(int a, int b) 
	{
	System.out.println(a+b);	
	}
	
	void add(int a, double b) 
	{
	System.out.println(a+b);	
	}
	
	void add(double a, int b) 
	{
	System.out.println(a+b);	
	}
	
	void add(double a, double b) 
	{
	System.out.println(a+b);	
	}
	
	void add(int a, int b, int c) 
	{
	System.out.println(a+b+c);	
	}
	
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.add(10, 20);
		obj.add(20, 30);
		obj.add(30, 40);
		obj.add(40, 40);
		obj.add(10, 30, 40);
	}
}

