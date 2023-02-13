package oops;

public class Constructor {

	int sId;
	String sName;
	char sGrade;

	Constructor (int id,String name, char g)
	{
		sId = id;
		sName = name;
		sGrade = g;		
	}

 public void display()
 {
	 System.out.println("Student id is "+ sId +" Studend name is "+sName +" Student grade is "+sGrade); 
 }
}
