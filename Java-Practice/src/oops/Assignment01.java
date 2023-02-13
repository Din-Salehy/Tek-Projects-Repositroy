package oops;

public class Assignment01 {

	int SID;
	String sName;
	int sub1;
	int sub2;
	int sub3;

	public void getStuData(int id, String name) 
	{
		SID =id;
		sName = name;
		
	}

	void getStudMarks(int Math, int Biology, int Physics) 
	{
	sub1 = Math; 
	sub2 = Biology;
	sub3 = Physics;
	}

	public void totalMarks() 
	{
		System.out.println(("Student id number "+SID + " With name "+sName) + "had total score " +(sub1 +sub2+sub3));
	}

	
	int a = 'S';

}
