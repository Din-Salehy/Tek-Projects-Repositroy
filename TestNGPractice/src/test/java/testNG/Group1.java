package testNG;
import org.testng.annotations.Test;


public class Group1 {

	
	@Test
	public void test1()
	{
		System.out.println("Group1 class --> Test1");
	}
	

	@Test (groups = {"smoke", "functional"})
	public void test2()
	{
		System.out.println("Group1 class --> Test2");
	}
	@Test (groups = {"smoke", "functional","regression"})
	public void test3()
	{
		System.out.println("Group1 class --> Test3");
	}

}
	

