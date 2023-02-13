package interfacee;

interface A
{
	int a= 10; // by default variable and interface are static and final
	void m1(); // Abstract method, by default it is public
}


public class Test implements A
{
	public void m1() 
	{
	System.out.println(a);
	}
		
	public static void main(String[] args) {
		
		Test a = new Test();
		a.m1();
	}
	
}
