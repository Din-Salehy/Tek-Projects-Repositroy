package testNG;
import org.testng.annotations.Test;


public class Exclude {

	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	

	@Test (groups = {"smoke", "functional"})
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test (groups = {"smoke", "functional","regression"})
	public void test3()
	{
		System.out.println("Test3");
	}

	public void test4()
	{
		System.out.println("Test4");
	}
}
	

