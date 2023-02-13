package overloading;

public class AssignmentCalculator {

	int sum(int a, int b)
	{
		return (a+b);
		
	}
	 
	int sum(int x, int y, int z)
	{
		return (x+y+z);
	}
	
	double sum(double x, double y)
	{
		return (x+y);
	}
	
	double sum(double x, double y, double z)
	{
		return (x+y+z);
	}
	
	public static void main(String[] args) {
		
		AssignmentCalculator cal = new AssignmentCalculator();
		System.out.println(cal.sum(10,20));
		System.out.println(cal.sum(10.5, 10.10));
		System.out.println(cal.sum(5, 7,8));
		System.out.println(cal.sum(5.6, 7.7, 9.8));
		
	}
}
