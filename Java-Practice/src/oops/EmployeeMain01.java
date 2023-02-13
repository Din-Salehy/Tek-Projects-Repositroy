package oops;

public class EmployeeMain01 {

	public static void main(String[] args) {
		ClassEmployee01 emp1 = new ClassEmployee01();
		emp1.id = 100;
		emp1.firstName = "John";
		emp1.lastName ="Amini";
		emp1.jobTitle= "Manager";
		emp1.departmentNumber= 02;
		emp1.departName = "Finance";
		emp1.display();
		
		System.out.println("----------------------------------------");
		
		ClassEmployee01 emp2 = new ClassEmployee01();
		emp2.id = 101;
		emp2.firstName = "David";
		emp2.lastName ="Amini";
		emp2.jobTitle= "Supervisor";
		emp2.departmentNumber= 03;
		emp2.departName = "Finance";
		emp2.display();
	
}
}