package oops.Interface;

interface Shape {

	int length = 10; // final and static variable by default
	int width = 4; // final and static variable by default
	int radius = 6; // final and static variable by default
	double pi = 3.14; // final and static variable by default

	void circle(); // abstract method

	default void square() { // default method
		System.out.println("This is square - default method");
	}

	static void rectangle() { // Interface level static method
		System.out.println("This is rectangle - static method created in interface");
	}
}

public class InterfaceDemo implements Shape {

	static void triangle() { // Class level static method
		System.out.println("This is triangle - static method created in class");
	}

	// To implement abstract method in class from interface We've to us public
	// keyword
	public void circle() {
		System.out.println("This is circle - abstract method from interface");
	}

	int x = 100, y = 200; // Class level variable

	public static void main(String[] args) {

//		Scenario 1 :- 
//		Using object ref of class to access methods & instantiating class
		System.out.println("Scenario 1 : Using object ref of class to access methods & instantiating class");
		InterfaceDemo cObj = new InterfaceDemo();

		// We can call abstract and default methods from interface by using Object
		// reference of the class
		cObj.circle(); // Can call abstract method
		cObj.square(); // Can call default method

		// We cann't call static methods from interface directly without object reference
		// We've to use interface name with method name.
		// We've to use name of the interface from which it belongs.
		Shape.rectangle();

		// We can call static methods from the class directly without object reference
		triangle();

		// We can access variables from class using class object reference
		System.out.println("Addition of class variables: " + (cObj.x + cObj.y));

//		Scenario 2 :- 
//		Using object reference of Interface to access methods and creating object of class.
		System.out.println("Scenario 2 : Using object ref of Interface to access methods and instantiating class.");
		Shape iObj = new InterfaceDemo();

		iObj.circle();
		iObj.square();

		Shape.rectangle();
		triangle();

		// We cann't access variables from class using interface object reference.
		// Because they belongs to class NOT Interface
//	    System.out.println("Addition of class variables: " + iObj.x + iObj.y);	

//		Scenario 3 :-
//		We can access interface level variables directly using the Interface name also
		System.out.println("Scenario 3 : We can access interface variables directly using the Interface name.");
		System.out.println("Area of Rectangle:- " + Shape.length * Shape.width); // 40
		System.out.println("Area of Circle:- " + pi * radius * radius); // 113.03999999999999
		System.out.println(length * width); // 40

	}

}
