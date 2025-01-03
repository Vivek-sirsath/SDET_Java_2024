package oops.classMethodsObjects;

public class Employee {

	int empId;
	String empName;
	String job;
	int sal;

	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(); // emp1 is object 1 of class Employee

		emp1.empId = 101;
		emp1.empName = "Vivek";
		emp1.job = "Software Tester";
		emp1.sal = 80000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.empId = 102;
		emp2.empName = "Deepika";
		emp2.job = "Software Developer";
		emp2.sal = 150000;
		emp2.display();

	}

}
