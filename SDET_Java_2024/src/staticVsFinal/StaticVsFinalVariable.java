package staticVsFinal;

class Test {

	static int x = 100; // Static
//	final int y = 50; // Non-Static
	int y = 50; // After removing final keyword here, error goes
}

class Test2 extends Test {

	int x = 30; // Modifying the x value through object
}

public class StaticVsFinalVariable {

	public static void main(String[] args) {

		// We can directly call static variable in main method
		// Here changed the value of static variable directly, No need of object
		// At runtime we can change the value of static variable x
		int x = 200;
		System.out.println(x); // 200

		// To call Non-Static variable we've to call through object of class
		Test2 sf = new Test2();
		System.out.println(sf.x); // 30
		System.out.println(sf.y); // 50

		// We cann't change value of final variable
		sf.y = 45; // ERROR: remove 'final' modifier of 'y'
		System.out.println(sf.y);

	}

}
