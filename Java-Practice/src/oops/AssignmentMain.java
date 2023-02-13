package oops;

public class AssignmentMain {

	public static void main(String[] args) {
		
		Assignment01 stu1 = new Assignment01();
		stu1.getStuData(10, " John Amini ");
		stu1.getStudMarks(100, 98,97);
		stu1.totalMarks();
		
		Assignment01 stu2 = new Assignment01();
		stu2.getStuData(11, " Ali Amini ");
		stu2.getStudMarks(99, 95,87);
		stu2.totalMarks();
	}
}