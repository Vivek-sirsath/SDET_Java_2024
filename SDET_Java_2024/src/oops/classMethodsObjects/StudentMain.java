package oops.classMethodsObjects;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.sid = 11;
		stu1.sname = "Ishita";
		stu1.grade = 'A';
		stu1.printData();
		
		Student stu2 = new Student();
		stu2.sid = 22;
		stu2.sname = "Deepika";
		stu2.grade = 'B';
		stu2.printData();
	}

}
