package accessModifiers.package1;

public class Test2 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		System.out.println(t1.x);
		t1.m1();
/*		
		System.out.println(t1.y); // error - The field Test1.y is not visible
		t1.m2(); // error - The method m2() from the type Test1 is not visible
*/
		
		System.out.println(t1.z);
		t1.m3();
	}

}
