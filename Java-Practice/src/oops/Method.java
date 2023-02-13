




package oops;

public class Method {

	
	int x= 10;
	int y= 20; 
	
//	void sum() // 1st Case ------------Method no parameter no return value
//	{
//	System.out.println(x+y);	
//	}
	
//	public static void main(String[] args) 
//	{
//		Method cal = new Method();
//		cal.sum();
//	}
	

//	int sum ()    // 2nd case ------ method no parameter but return
//	{
//		return (x+y);
//	}
//	
//	public static void main(String[] args) 
//	{
//		Method cal = new Method();
//		System.out.println(cal.sum());
//	}
	
//	void sum (int a, int b) // case 3: Parameter with no return 
//	{
//		System.out.println(a+b);
//	}
//	
//	public static void main(String[] args) {
//	Method cal = new Method();
//	cal.sum(100, 100);
//	}
	
	int sum(int a, int b )
	{
		return (a+b);
	}
	
	public static void main(String[] args) {
		Method cal = new Method();
		System.out.println(cal.sum(12, 13));
	}
}
