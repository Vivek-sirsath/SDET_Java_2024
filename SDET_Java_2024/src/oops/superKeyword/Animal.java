package oops.superKeyword;

/*
 * Super keyword is used to invoke the immediate parent class variable
 * Super keyword is used to invoke the immediate parent class method also.
 */

public class Animal {

	String color = "White";
	
	void eat() { // parent class method
		System.out.println("Parent class method - eating meat...");
	}

}

class Dog extends Animal {

	String color = "Black"; // Override the variable value

	void displayColor() {

//		System.out.println(color);
		System.out.println("Child class variable" + " : " + color);

	}
	
	void displayColorSuper() {
		System.out.println("Parent class super varible" + " : " + super.color);
	}
	
	void eat() { // child class method
//		System.out.println("Child class method - eating bread...");
		super.eat(); 
	}
}
