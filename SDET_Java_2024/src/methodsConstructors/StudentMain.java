package methodsConstructors;

public class StudentMain {

	public static void main(String[] args) {
	
//		Ways of assigning data to class variables
		
/*		1) By object reference variables
		Student stu = new Student();
		stu.sid = 101;
		stu.sname = "David";
		stu.grade = 'A';
		stu.printStudentData();
		
		
//		2) By using user defined method
		stu.setStudentData(102, "Henry", 'B');
		stu.printStudentData();
*/		
		
//		3) By using Constructor
		Student stu1 = new Student(103, "William", 'C');
		stu1.printStudentData();

	}

}
