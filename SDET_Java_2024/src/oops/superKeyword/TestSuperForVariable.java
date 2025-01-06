package oops.superKeyword;

public class TestSuperForVariable {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.displayColor(); // Black
		// Without using super keyword Printing the value from child class Dog

		/*
		 * We want to display the value from the Parent class, for that, we need to use
		 * super keyword with the variable name in the child class Dog e.g.
		 * System.out.println(super.color);
		 */
		
		d.displayColorSuper(); // White
		// After using super keyword, printing the value from parent class Animal
		
//		d.eat(); // eating bread...
//	    Without using super keyword Printing the default value from child class
		
		d.eat(); // eating meat...
//		After using super keyword Printing the value from parent class
//		Calling the child class method but, invoking the parent class method
	}

}
