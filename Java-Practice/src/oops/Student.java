package oops;

public class Student {

	int sId;
	String sName;
	char sGrade;
	
	public void studentInfo() 
	{
	System.out.println("Student id is "+ sId +" Studend name is "+sName +" Student grade is "+sGrade);	
	}

// 2nd approach using parameter
	
	public void studentInfo2(int id, String name, char grade)
	{
		sId = id;
		sName = name;
		sGrade = grade;
		
	}

}
