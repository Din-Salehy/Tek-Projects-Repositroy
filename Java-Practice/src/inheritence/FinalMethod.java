package inheritence;

public class FinalMethod {

	final void run()
	{
		System.out.println("running-----------------");
	}
	
	class Honda extends FinalMethod{
//		void run() // Cause Compile error 
		{
			System.out.println("starting-----------------");
		}
	}
}
