/*
 * In this class wee can create multiple objects of Test Class
 * Without use of reference variables.
 * 
 * Syntax: 
 *         new ClassNameConstructor().methodName();         
 * */

package objectsWithoutReferenceVariablesOfObjectsOfClass;

public class TestMain {

	public static void main(String[] args) {
		
		// Print statement already implemented in methods 
		// We will only instantiate the class here
		
		new Test().play(); // Not used reference variable
		
		new Test().eat(); // Not used reference variable
		
		new Test().sing(); // Not used reference variable 
		

	}

}
