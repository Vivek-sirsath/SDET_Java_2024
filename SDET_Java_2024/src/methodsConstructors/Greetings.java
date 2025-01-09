
/*
 * Methods: Block or group of statements which will perform certain task.
 * method will be called through object.
 * 
 * Types:-
 * 1) No parameters  No return value
 * 2) No parameters  Return value
 * 3) Takes parameters  No return value
 * 4) Takes parameters  Return value
 * 
 * e.g.
 *       String s = new String("Welcome");  
 *       int len = s.length();   // No parameters  Return value
 *       
 *       String sub = s.substring(2,5);  // Takes parameters return value
 *             
 * */

package methodsConstructors;

public class Greetings {

//	Type 1) No parameters  No return value

	void m1() {
		System.out.println("m1: No Parameter & No return value");
	}

//	Type 2) No parameters  Return value
	String m2() {
		return "m2: No parameters  Return value";
	}

//	Type 3) Takes parameters  No return value
	void m3(String name) {
		System.out.println("m3: Hello..." + name);
	}

//	Type 4) Takes parameters  Return value
	String m4(String name) {
		return("m4: Hello..." + name);	
	}

}
