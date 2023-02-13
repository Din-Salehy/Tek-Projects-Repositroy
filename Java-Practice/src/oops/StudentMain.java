package oops;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
//		stu1.id = 12;
//		stu1.name = "Ijaz Ahamad";
//		stu1.grade = 'A';
//		stu1.studentInfo();
		
//		2nd approach using parameter.
		stu1.studentInfo2(10, "John", 'A');
		stu1.studentInfo();
	}
}