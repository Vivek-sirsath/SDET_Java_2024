package oops.encapsulation2;

// Encapsulation :- Binding the code in to a single unit.
public class Encapsulation2 extends Encapsulation1 {

	public static void main(String[] args) {

		Encapsulation2 e2 = new Encapsulation2();
//		Encapsulation1 e2 = new Encapsulation1();  // Also acceptable - Same Output
		e2.setName("Selenium");
		System.out.println(e2.getName());
	}
}

/*
 * 5 
 * 2 
 * Selenium
 */
