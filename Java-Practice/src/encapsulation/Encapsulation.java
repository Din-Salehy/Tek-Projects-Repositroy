package encapsulation;

class Student{
	
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class Encapsulation {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.setName("Navi");
	s1.setRollno(2);
	
	String name = s1.getName();
	int rollNo = s1.getRollno();
	System.out.println(name);
	System.out.println(rollNo);
}
	
	
}
