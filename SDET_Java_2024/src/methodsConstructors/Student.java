package methodsConstructors;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	void printStudentData(){
		System.out.println(sid + " " + sname + " " + grade);
	}
	
	void setStudentData(int id, String name, char grad) {
		
		sid = id;
		sname = name;
		grade = grad;
		
	}
	
	Student (int id, String name, char gra){
		
		sid = id;
		sname = name;
		grade = gra;
		
	}

}
